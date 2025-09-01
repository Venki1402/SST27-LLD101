package com.example.orders;

import java.util.List;

import com.example.orders.Order.OrderBuilder;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited,
            String notes) {
        // Order o = new Order.OrderBuilder(id, email).setDiscountPercent(discount);
        OrderBuilder orderBuilder = new OrderBuilder(id, email);
        if (lines != null)
            for (OrderLine l : lines)
                orderBuilder.addLine(l);
        orderBuilder.setExpedited(expedited);
        orderBuilder.setNotes(notes);
        Order o = orderBuilder.build();
        return o;
    }
}
