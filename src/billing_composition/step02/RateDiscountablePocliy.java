package billing_composition.step02;

import money.Money;

public class RateDiscountablePocliy extends AdditionalRatePolicy {

    private Money discountAmount;

    public RateDiscountablePocliy(RatePolicy next, Money discountAmount) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
