package io.lcalmsky.shop.repository;

import io.lcalmsky.shop.domain.Delivery;
import io.lcalmsky.shop.domain.Member;
import io.lcalmsky.shop.domain.Order;
import io.lcalmsky.shop.domain.OrderItem;
import io.lcalmsky.shop.domain.item.Item;
import io.lcalmsky.shop.repository.ItemRepository;
import io.lcalmsky.shop.repository.MemberRepository;
import io.lcalmsky.shop.repository.OrderRepository;
import io.lcalmsky.shop.service.OrderSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderService {
    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    @Transactional
    public Long order(Long memberId, Long itemId, int count) {
        Member member = memberRepository.findOne(memberId);
        Item item = itemRepository.findOne(itemId);
        Delivery delivery = new Delivery();
        delivery.setAddress(member.getAddress());
        OrderItem orderItem = OrderItem.newOrderItem(item, item.getPrice(), count);
        Order order = Order.newOrder(member, delivery, orderItem);
        orderRepository.save(order);
        return order.getId();
    }

    public void cancelOrder(Long orderId) {
        Order order = orderRepository.findOne(orderId);
        order.cancel();
    }

    public List<Order> findOrder(OrderSearch orderSearch) {
        return orderRepository.findAll(orderSearch);
    }
}
