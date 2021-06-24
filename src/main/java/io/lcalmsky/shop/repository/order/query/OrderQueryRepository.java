package io.lcalmsky.shop.repository.order.query;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class OrderQueryRepository {
    private final EntityManager entityManager;

    public List<OrderQueryDto> findOrderDtoList() {
        return entityManager.createQuery("select new io.lcalmsky.shop.repository.order.query.OrderQueryDto(o.id, o.member.name, o.orderDate, o.status, o.delivery.address) from Order o " +
                "join o.member m " +
                "join o.delivery d ", OrderQueryDto.class).getResultList();
    }

    public List<OrderQueryDto> findOrderQueryDtos() {
        List<OrderQueryDto> orders = getOrders();
        orders.forEach(o -> o.setOrderItems(getOrderItems(o.getOrderId())));
        return orders;
    }

    private List<OrderQueryDto> getOrders() {
        return entityManager.createQuery("select new io.lcalmsky.shop.repository.order.query.OrderQueryDto(o.id, m.name, o.orderDate, o.status, d.address) from Order o " +
                "join o.member m " +
                "join o.delivery d", OrderQueryDto.class)
                .getResultList();
    }

    private List<OrderItemQueryDto> getOrderItems(Long orderId) {
        return entityManager.createQuery("select new io.lcalmsky.shop.repository.order.query.OrderItemQueryDto(oi.order.id, i.name, oi.orderPrice, oi.count) " +
                "from OrderItem oi " +
                "join oi.item i " +
                "where oi.order.id = :orderId", OrderItemQueryDto.class)
                .setParameter("orderId", orderId)
                .getResultList();
    }

    public List<OrderQueryDto> findAllDtos() {
        List<OrderQueryDto> orders = getOrders();
        Map<Long, List<OrderItemQueryDto>> orderItemMap = getOrderItemMap(orders);
        orders.forEach(o -> o.setOrderItems(orderItemMap.get(o.getOrderId())));
        return orders;
    }

    private Map<Long, List<OrderItemQueryDto>> getOrderItemMap(List<OrderQueryDto> orders) {
        List<Long> orderIds = orders.stream().map(OrderQueryDto::getOrderId).collect(Collectors.toList());
        List<OrderItemQueryDto> orderItems = getOrderItemQueryDtos(orderIds);
        return orderItems.stream().collect(Collectors.groupingBy(OrderItemQueryDto::getOrderId));
    }

    private List<OrderItemQueryDto> getOrderItemQueryDtos(List<Long> orderIds) {
        return entityManager.createQuery("select new io.lcalmsky.shop.repository.order.query.OrderItemQueryDto(oi.order.id, i.name, oi.orderPrice, oi.count) " +
                "from OrderItem oi " +
                "join oi.item i " +
                "where oi.order.id in :orderIds", OrderItemQueryDto.class)
                .setParameter("orderIds", orderIds)
                .getResultList();
    }
}
