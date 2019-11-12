package billing_composition.step02;

import money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
