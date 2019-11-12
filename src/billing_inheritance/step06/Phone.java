package billing_inheritance.step06;

import money.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();
//만약 세금을 추가한다면?
    public Money calculateFee() {
        Money result = Money.ZERO;

        for(Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    abstract protected Money calculateCallFee(Call call);
}
