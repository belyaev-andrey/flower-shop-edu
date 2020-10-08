package ru.vsu.csf.group.flowers.shopping;

import ru.vsu.csf.group.flowers.model.Goods;

import java.math.BigDecimal;

public class CartItem {

    private Goods goods;

    private int amount;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getItemPrice() {
        return goods.getPrice().multiply(BigDecimal.valueOf(amount));
    }
}
