package io.lcalmsky.shop;

import io.lcalmsky.shop.domain.*;
import io.lcalmsky.shop.domain.item.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {
    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.init();
        initService.init2();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager entityManager;

        public void init() {
            Member member = createMember("userA", "seoul", "aaa", "11111");
            entityManager.persist(member);

            Book book = createBook("JPA1", 10000, 100);
            entityManager.persist(book);

            Book book2 = createBook("JPA2", 20000, 100);
            entityManager.persist(book2);

            OrderItem orderItem1 = OrderItem.newOrderItem(book, 10000, 1);
            OrderItem orderItem2 = OrderItem.newOrderItem(book2, 20000, 1);

            Delivery delivery = createDelivery(member);
            Order order = Order.newOrder(member, delivery, orderItem1, orderItem2);
            entityManager.persist(order);
        }

        public void init2() {
            Member member = createMember("userB", "busan", "bbb", "22222");
            entityManager.persist(member);

            Book book = createBook("Spring1", 20000, 500);
            entityManager.persist(book);

            Book book2 = createBook("Spring2", 40000, 300);
            entityManager.persist(book2);

            OrderItem orderItem1 = OrderItem.newOrderItem(book, 20000, 3);
            OrderItem orderItem2 = OrderItem.newOrderItem(book2, 40000, 4);

            Delivery delivery = createDelivery(member);
            Order order = Order.newOrder(member, delivery, orderItem1, orderItem2);
            entityManager.persist(order);
        }

        private Delivery createDelivery(Member member) {
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            return delivery;
        }

        private Book createBook(String name, int price, int stockQuantity) {
            Book book = new Book();
            book.setName(name);
            book.setPrice(price);
            book.setStockQuantity(stockQuantity);
            return book;
        }

        private Member createMember(String name, String city, String street, String zipcode) {
            Member member = new Member();
            member.setName(name);
            member.setAddress(new Address(city, street, zipcode));
            return member;
        }
    }
}
