package ru.vsu.csf.group.flowers.shopping;

import java.math.BigDecimal;

public class SaleCart extends AbstractCart {

    private PriceCalculator calculator;

    public SaleCart(PriceCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return calculator.getTotalPrice(goods);
    }
}
