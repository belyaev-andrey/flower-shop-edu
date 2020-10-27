package ru.vsu.csf.group.flowers.shopping;

import java.math.BigDecimal;
import java.util.List;

public class SalesPriceCalculator implements PriceCalculator {

    @Override
    public BigDecimal getTotalPrice(List<CartItem> goods) {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem c : goods) {
            total = total.add(c.getItemPrice());
        }
        if (goods.size() >= 10) {
            return total.multiply(BigDecimal.ZERO);
        }
        return total;
    }

}
