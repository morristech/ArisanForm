package com.github.arisanform.model;

import com.github.arisan.annotation.Form;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    @Form
    private String orderer;
    @Form(type=Form.SPINNER, position = 0)
    private String menu;
    @Form(type=Form.NUMBER)
    private int quantity;
    @Form(type=Form.CHECKBOX, position = 1)
    private List<String> topping;
    @Form(type=Form.BOOLEAN)
    private boolean hot;
    @Form(type=Form.TIME,dateFormat = "HH:mm")
    Date time;
    @Form(type=Form.DATE,dateFormat = "dd-MM-yyyy")
    Date created_at;

    public Order() {
    }

    public Order(int id, String orderer, String menu, int quantity, List<String> topping, boolean hot) {
        this.id = id;
        this.orderer = orderer;
        this.menu = menu;
        this.quantity = quantity;
        this.topping = topping;
        this.hot = hot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderer() {
        return orderer;
    }

    public void setOrderer(String orderer) {
        this.orderer = orderer;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<String> getTopping() {
        return topping;
    }

    public void setTopping(List<String> topping) {
        this.topping = topping;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }
}
