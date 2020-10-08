package ru.vsu.csf.group.flowers.model.storage;

import ru.vsu.csf.group.flowers.model.Goods;
import ru.vsu.csf.group.flowers.model.Storable;

public class StorageItem implements Storable {

    private Long id;
    private Goods goods;
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
