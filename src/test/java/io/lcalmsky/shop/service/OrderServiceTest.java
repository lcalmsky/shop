package io.lcalmsky.shop.service;

import io.lcalmsky.shop.domain.Address;
import io.lcalmsky.shop.domain.Member;
import io.lcalmsky.shop.domain.Order;
import io.lcalmsky.shop.domain.OrderStatus;
import io.lcalmsky.shop.domain.item.Book;
import io.lcalmsky.shop.exception.NotEnoughStockException;
import io.lcalmsky.shop.repository.OrderRepository;
import io.lcalmsky.shop.repository.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class OrderServiceTest {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("상품 주문")
    public void order() {
        // given
        Member member = createMember();
        Book book = createBook("JPA", 10000, 10);
        int orderCount = 2;

        // when
        Long orderId = orderService.order(member.getId(), book.getId(), orderCount);

        // then
        Order one = orderRepository.findOne(orderId);
        assertEquals(OrderStatus.ORDER, one.getStatus(), "주문 상태가 같아야 함");
        assertEquals(1, one.getOrderItems().size(), "주문한 상품 종류가 같아야 함");
        assertEquals(orderCount * book.getPrice(), one.getTotalPrice(), "총 주문 가격이 같아야 함");
        assertEquals(8, book.getStockQuantity(), "주문 수량만큼 재고가 줄어야 함");
    }

    private Book createBook(String name, int price, int stockQuantity) {
        Book book = new Book();
        book.setName(name);
        book.setPrice(price);
        book.setStockQuantity(stockQuantity);
        book.setIsbn("123abc");
        entityManager.persist(book);
        return book;
    }

    private Member createMember() {
        Member member = new Member();
        member.setName("kim");
        member.setAddress(new Address("seoul", "11st", "00123"));
        entityManager.persist(member);
        return member;
    }

    @Test
    @DisplayName("주문 취소")
    public void cancelOrder() {
        // given
        Member member = createMember();
        Book book = createBook("bbb", 10000, 10);
        int orderCount = 2;
        Long orderId = orderService.order(member.getId(), book.getId(), orderCount);

        // when
        orderService.cancelOrder(orderId);

        // then
        Order one = orderRepository.findOne(orderId);
        assertEquals(OrderStatus.CANCEL, one.getStatus(), "주문 취소시 상태는 CANCEL 이어야 함");
        assertEquals(10, book.getStockQuantity(), "주문 취소시 재고가 다시 증가해야 함");
    }

    @Test
    @DisplayName("재고 수량 초과")
    public void exception() {
        // given
        Member member = createMember();
        Book book = createBook("abc", 20000, 5);
        int orderCount = 10;

        // when
        // then
        assertThrows(NotEnoughStockException.class, () -> orderService.order(member.getId(), book.getId(), orderCount));
    }
}
