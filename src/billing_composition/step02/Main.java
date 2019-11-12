package billing_composition.step02;

import money.Money;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone(
                new TexablePolicy(
                        new RateDiscountablePocliy(new RegularPocliy(Money.wons(10), Duration.ofSeconds(10)), Money.wons(1000)), 0.05)
        );

        Money money = phone.calculateFee();

        Phone phone2 = new Phone(
                new RateDiscountablePocliy(
                        new TexablePolicy(
                                new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(100)), 0.05), Money.wons(10)
                )
        );

        Money money1 = phone2.calculateFee();
    }
}
