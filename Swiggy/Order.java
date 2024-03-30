package Swiggy;

import java.util.Date;

public class Order {
    private User user;

    private Shop shop;

    private int orderId;

    private Date orderTime;

    public Order(User user, Shop shop, Date orderTime) {
        this.user = user;
        this.shop = shop;
        this.orderTime = orderTime;
    }
}
