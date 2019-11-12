package billing_composition.step01;

import money.Money;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone(new RegularPocliy(Money.wons(10), Duration.ofSeconds(10)));
        Money money = phone.calculateFee();
        Phone nightPhone = new Phone(new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)));
        Money nightMoney = nightPhone.calculateFee();
    }
}
