package billing_composition.step01;

import money.Money;

import java.time.Duration;

public class RegularPocliy extends BasicRatePolicy {

    private Money amount;
    private Duration seconds;

    public RegularPocliy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        long percent = call.getDuration().getSeconds() / seconds.getSeconds();
        return amount.times(percent);
    }
}
