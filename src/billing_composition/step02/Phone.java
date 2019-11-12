package billing_composition.step02;

import money.Money;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }
}

//여기서 Line 9 ratePolicy 집중해야 한다. 이것이 바로 합성.