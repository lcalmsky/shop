package io.lcalmsky.shop.api;

import io.lcalmsky.shop.domain.Order;
import io.lcalmsky.shop.repository.OrderRepository;
import io.lcalmsky.shop.repository.order.query.OrderQueryDto;
import io.lcalmsky.shop.repository.order.query.OrderQueryRepository;
import io.lcalmsky.shop.service.OrderSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * xToOne(ManyToOne, OneToOne)
 * Order
 * Order --> Member
 * Order --> Delivery
 */
@RestController
@RequiredArgsConstructor
public class SimpleOrderApiController {
    private final OrderRepository orderRepository;
    private final OrderQueryRepository orderQueryRepository;

    @GetMapping("/api/v1/simple-orders")
    public List<Order> ordersV1() {
        return orderRepository.findAllByString(new OrderSearch());
    }

    @GetMapping("/api/v2/simple-orders")
    public List<OrderQueryDto> ordersV2() {
        return orderRepository.findAllByString(new OrderSearch()).stream()
                .map(OrderQueryDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/api/v3/simple-orders")
    public List<OrderQueryDto> ordersV3() {
        return orderRepository.findAllWithMemberDelivery()
                .stream()
                .map(OrderQueryDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/api/v4/simple-orders")
    public List<OrderQueryDto> ordersV4() {
        return orderQueryRepository.findOrderDtoList();
    }
}
