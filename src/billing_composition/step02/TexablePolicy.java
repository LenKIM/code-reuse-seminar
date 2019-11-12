package billing_composition.step02;

import money.Money;

public class TexablePolicy extends AdditionalRatePolicy {
    private double taxRatio;

    public TexablePolicy(RatePolicy next, double taxRatio) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
