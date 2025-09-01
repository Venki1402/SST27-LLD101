package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public final class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;

    // public Order(String id, String customerEmail) {
    // this.id = id;
    // this.customerEmail = customerEmail;
    // }

    // public Order(String id, String customerEmail, Integer discountPercent) {
    // this(id, customerEmail);
    // this.discountPercent = discountPercent;
    // }

    // public void addLine(OrderLine line) {
    // lines.add(line);
    // }

    // public void setDiscountPercent(Integer discountPercent) {
    // this.discountPercent = discountPercent;
    // }

    // public void setExpedited(boolean expedited) {
    // this.expedited = expedited;
    // }

    // public void setNotes(String notes) {
    // this.notes = notes;
    // }

    public String getId() {
        return id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public List<OrderLine> getLines() {
        List<OrderLine> copy = new ArrayList<>();
        for (OrderLine line : lines) {
            copy.add(new OrderLine(line));
        }
        return copy;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public boolean isExpedited() {
        return expedited;
    }

    public String getNotes() {
        return notes;
    }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines)
            sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null)
            return base;
        return base - (base * discountPercent / 100);
    }

    public static class OrderBuilder {
        private String id;
        private String customerEmail;
        private List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent;
        private boolean expedited;
        private String notes;

        public OrderBuilder(String id, String customerEmail) {
            this.id = id;
            this.customerEmail = customerEmail;
        }

        public OrderBuilder setDiscountPercent(Integer discountPercent) {
            if (discountPercent < 0 || discountPercent > 100) {
                System.out.println("NOT APPLICABLE!!");
            }
            this.discountPercent = discountPercent;
            return this;
        }

        public OrderBuilder setExpedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public OrderBuilder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public OrderBuilder addLine(OrderLine line) {
            this.lines.add(line);
            return this;
        }

        public Order build() {
            List<OrderLine> linesCopy = new ArrayList<>();
            for (OrderLine it : this.lines) {
                linesCopy.add(new OrderLine(it));
            }
            this.lines = linesCopy;
            return new Order(this);
        }
    }

    private Order(OrderBuilder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        this.lines.addAll(builder.lines);
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

}
