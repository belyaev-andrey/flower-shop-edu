package ru.vsu.csf.group.flowers.shopping;

import java.math.BigDecimal;

public class ClassicCart extends AbstractCart {

    private PriceCalculator calculator; //TODO подставить нужный калькулятор

    public ClassicCart(PriceCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return calculator.getTotalPrice(goods);
    }
}
