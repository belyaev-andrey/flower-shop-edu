package ru.vsu.csf.group.flowers.model;

import ru.vsu.csf.group.flowers.shopping.AbstractCart;

public class Customer implements Storable {

    private Long id;

    private String login;

    private String deliveryAddress;

    private AbstractCart cart;//TODO сконфигурировать нужную коррзину в зависимости от ...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String GenerateBill() {
        return cart.getTotalPrice().toString();
    }
}
