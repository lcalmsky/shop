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
  

### References

- [Spring Boot Guide](https://spring.io/guides)
- [thymeleaf](https://thymeleaf.org)
