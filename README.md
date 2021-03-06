![](https://img.shields.io/badge/spring--boot-2.5.1-red)
![](https://img.shields.io/badge/gradle-7.0.2-brightgreen)

## Overview

### Project

- java: 11
- build: gradle
- dependencies: web, jpa, h2, lombok, thymeleaf, configuration-processor

### Dependencies

```shell
> ./gradlew dependencies
```

### 요구사항 분석

- 회원 기능
    - 회원 등록
    - 회원 조회
- 상품 기능
    - 상품 등록
    - 상품 수정
    - 상품 조회
- 주문 기능
  - 상품 주문
  - 주문 내역 조회
  - 주문 취소
- 기타 요구사항
  - 상품은 재고 관리가 필요하다.
  - 상품의 종류는 도서, 음반, 영화가 있다. 상품을 카테고리로 구분할 수 있다.

### 도메인 모델, 테이블 설계

- 도메인 모델
  - 회원:주문=1:*
  - 주문:상품=\*:\*
    - 관계형 데이터베이스에서는 다대다 관계를 사용하지 않음
    - 주문 상품을 아우르는 도메인을 이용해 일대다, 다대일로 설계해야함
  - 운영 환경에서는 다대다 관계를 사용하면 안 됨
  - 양방향 관계도 지양하는 것이 좋음

![domain-diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/lcalmsky/shop/master/diagram/domain-diagram.plantuml)

- 테이블 설계
  - single table 전략을 사용해 Item을 상속받은 객체들이 하나의 테이블을 공유, 성능에 이점
  - category - item을 아우르는 category item 테이블 필요

![er-diagram](https://raw.githubusercontent.com/lcalmsky/shop/master/diagram/er-diagram.png)

- 연관관계 매핑 분석
  - 회원-주문
    - 일대다, 다대일의 양뱡향 관계
    - 연관관계의 주인을 정해야 하는데 외래키가 있는 주문을 연관관계의 주인으로 정하는 것이 좋음
    - 일대다 관계에서는 "다"에 외래키가 존재
    - Order.member를 ORDERS.MEMBER_ID의 FK와 매핑
  - 주문상품-주문
    - 다대일 양방향 관계
    - 주문상품에 외래키가 있으므로 주문상품이 연관관계의 주인
    - OrderItem.order를 ORDER_ITEM.ORDER_ID FK와 매핑
  - 주문상품-상품
    - 다대일 단방향 관계
    - OrderItem은 Item을 참조할 수 있지만 Item은 OrderItem을 참조할 수 없음
    - Item을 확인하면서 Item을 주문한 OrderItem을 모두 확인할 일이 없음
  - 주문-배송
    - 일대일 단방향 관계
    - 주문이 FK를 가지므로 주문이 연관관계의 주인이 됨
  - 카테고리와 상품
    - 다대다 관계
    - 단순 예제용
  - 연관관계의 주인은 단순히 FK를 누가 관리하느냐로 정해져야 함


### Entity 설계시 주의점

- 가급적 `Setter`를 사용하지 않기
  - 변경 포인트가 많아 유지보수가 어려워짐
- 모든 연관관계는 지연로딩(`LAZY`)으로 설정
  - `EAGER`는 예측이 어렵고 추적이 어려움
  - fetch join 또는 graph 기능을 이용해야 함
  - `OneToOne`, `ManyToOne` 관계는 기본이 EAGER 이므로 직접 `LAZY`로 바꿔줘야 함
  - `OneToMany`는 기본이 `LAZY`
- 컬렉션은 필드초기화 사용
  - NPE 방지
  - hibernate에서 persist시 자체 Collection으로 wrapping함
- 테이블, 컬럼명 생성 전략
  - 스프링 사용시: `SpringPhysicalNamingStrategy`
    - camel -> underscore
    - . -> underscore
    - uppercase -> lowercase
  - 논리명 생성: 명시적으로 적지 않으면 `ImplicitNamingStrategy` 사용
    - spring.jpa.hibernate.naming.implicit-naming-strategy
  - 물리명 적용: 모든 논리명에 적용됨, 실제 테이블에 적용
    - spring.jpa.hibernate.naming.physical-strategy

### Service-Entity 관련 패턴

- 도메인 모델 패턴: Entity가 비즈니스 로직을 가지고 객체 지향의 특성을 적극 활용하는 것
- 트랜잭션 스크립트 패턴: Entity에는 비즈니스 로직이 거의 없고 Service Layer에서 대부분의 비즈니스 로직을 처리하는 것

> ❗이 프로젝트에서는 **도메인 모델 패턴**을 사용<br>
> `JPA`과 같은 `ORM`을 사용할 경우 도메인 모델 패턴을 사용하는 게 더 유리함<br>
> 문맥에 맞게 유연하게 패턴 적용 필요

### 변경 감지(Dirty Checking)와 병합(Merge)

> *준영속 Entity*<br>
> 영속성 컨텍스트가 더 이상 관리하지 않는 Entity<br>
> 임의로 만든 Entity도 식별자를 가지고 있으면 준영속 Entity에 해당

- 준영속 Entity를 수정하는 두 가지 방법
  - Dirty Checking
    - 원하는 속성만 변경할 수 있음
  - Merge
    - merge로 넘긴 파라미터는 영속성 컨텍스트가 되지 않고 merge의 반환 값은 영속성 컨텍스트가 됨
    - 전체 속성을 변경하기 때문에 필드가 비어있으면 null로 업데이트 됨

### Fetch Join 최적화

- join 관계에 있는 테이블들에 대해 SQL 수행을 한 번으로 줄여줌
  - `OneToMany`, `ManyToMany`
- `distinct`
  - DB에서 distinct 처리
  - ID가 동일한 중복 데이터 제거
- 페이징이 불가능함
  - 1:N, N:N join이 있을 경우
  - limit 등을 사용하지 않고 전체를 가져온 뒤 메모리에서 페이징 처리
- Collection fetch join은 한 개만 사용 가능
  - 둘 이상에 사용하면 데이터가 부정합하게 조회될 수 있음

### Fetch Join with Paging

- 1:N에서 1을 기준으로 페이징하기 위함
  - 데이터는 N을 기준으로 생성
- XToOne 관계는 모두 `Fetch Join` 사용
- `Collection`은 Lazy Loading
- Lazy Loading 최적화
  - `spring.jpa.properties.hibernate.default_batch_fetch_size`: 글로벌 설정
  - `@BatchSize` 개별 최적화
    - ToOne 관계에 해당하는 경우 클래스에 애너테이션 추가
    - ToMany 관계에 해당하는 경우 필드에 애너테이션 추가
  - 이 옵션을 사용하면 `Collection`이나 `Proxy` 객체를 `IN`을 이용해 쿼리
  
### Fetch Join, Batch Summary

- ToOne 관계는 Fetch Join 사용
- ToMany 관계는 지연로딩 설정 후 batch 옵션 사용
- 위 같이 설정하면 쿼리 효율이 1 + N -> 1 + 1 로 최적화
- Join을 사용하는 것보다 DB 데이터 전송량이 최적화됨
  - 데이터 양이 많을 때 유리(Transaction 수는 많이 줄지 않지만 데이터량이 많이 감소)
- 페이징 가능

> spring.jpa.properties.hibernate.default_batch_fetch_size 사이즈는 100~1000이 적당하다. <br>
> IN 절 내에 포함되는 파라미터와 조회 후 반환받은 데이터량을 메모리 설정 등과 비교 및 고려하여 적당한 숫자로 설정해야 한다.



### References

- [Spring Boot Guide](https://spring.io/guides)
- [thymeleaf](https://thymeleaf.org)
