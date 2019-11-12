package billing_composition.step01;

import money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
