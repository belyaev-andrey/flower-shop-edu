package ru.vsu.csf.group.flowers.shopping;

import java.math.BigDecimal;
import java.util.List;

public interface PriceCalculator {
    BigDecimal getTotalPrice(List<CartItem> goods);
}
