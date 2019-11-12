package billing_inheritance.step07;


import money.Money;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone {
    private Money discountAmount;

    public RateDiscountableRegularPhone(Money amount, Duration seconds, Money discountAmount) {
        super(amount, seconds);
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
