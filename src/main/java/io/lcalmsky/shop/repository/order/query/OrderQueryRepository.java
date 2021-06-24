package io.lcalmsky.shop.repository.order.query;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderQueryRepository {
    private final EntityManager entityManager;

    public List<OrderQueryDto> findOrderDtoList() {
        return entityManager.createQuery("select new io.lcalmsky.shop.repository.order.query.OrderQueryDto(o.id, o.member.name, o.orderDate, o.status, o.delivery.address) from Order o " +
                "join o.member m " +
                "join o.delivery d ", OrderQueryDto.class).getResultList();
    }
}
