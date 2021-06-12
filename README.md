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


### References

- [Spring Boot Guide][https://spring.io/guides]
- [thymeleaf](https://thymeleaf.org)
