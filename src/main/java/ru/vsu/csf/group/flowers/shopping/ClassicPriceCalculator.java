package ru.vsu.csf.group.flowers.shopping;

import java.math.BigDecimal;
import java.util.List;

public class ClassicPriceCalculator implements PriceCalculator {

    @Override
    public BigDecimal getTotalPrice(List<CartItem> goods) {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem c : goods) {
            total = total.add(c.getItemPrice());
        }
        return total;
    }
}
