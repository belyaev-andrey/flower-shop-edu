package ru.vsu.csf.group.flowers.shopping;

import ru.vsu.csf.group.flowers.model.Storable;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Cart implements Storable {

    private Long id;

    private List<CartItem> goods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void add(CartItem cartItem) {

        List<CartItem> cartItems = goods.stream()
                .filter(c -> (c.getGoods().getId().equals(cartItem.getGoods().getId())))
                .collect(Collectors.toList());

        if (cartItems.size() == 1) {
            CartItem item = cartItems.get(0);
            item.setAmount(item.getAmount()+cartItem.getAmount());
        } else if (cartItems.size() == 0) {
            goods.add(cartItem);
        } else {
            throw new IllegalStateException("В корзине есть товары с одинаковым штрих-кодом");
        }
    }

    public boolean remove(Object o) {
        return goods.remove(o);
    }

    public void clear() {
        goods.clear();
    }

    public BigDecimal getTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem c : goods) {
            total = total.add(c.getItemPrice());
        }
        return total;
    }
}
