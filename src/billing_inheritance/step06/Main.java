package billing_inheritance.step06;

import money.Money;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        Phone phone = new NightlyDiscountPhone(Money.wons(5), Money.wons(10), Duration.ofSeconds(10));
        Money money = phone.calculateFee();
    }
}
