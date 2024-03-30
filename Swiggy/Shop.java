package Swiggy;

import java.util.Date;

public class Shop {
    private Date onTime;
    private Date offTime;
    private String address;

    private Dish dish;

    public Date getOnTime() {
        return onTime;
    }

    public Date getOffTime() {
        return offTime;
    }

    public String getAddress() {
        return address;
    }

    public Shop(Date onTime, Date offTime, String address) {
        this.onTime = onTime;
        this.offTime = offTime;
        this.address = address;

    }
}
