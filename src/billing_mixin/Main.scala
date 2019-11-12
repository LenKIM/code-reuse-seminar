package billing_mixin

import java.time.{Duration, LocalDateTime}

import billing_mixin.mixin.RateDiscountableAndTaxableRegularPolicy
import money.Money

object Main extends App {

//  val traitPhone = new Phone(
//    List(
//      Call(LocalDateTime.of(2017, 1, 2, 10, 0), LocalDateTime.of(2017, 1, 2, 10, 1))
//    ),
//    new RegularPolicy(Money.wons(100), Duration.ofSeconds(10)) with RateDiscountablePolicy with TaxablePolicy {
//      val discountAmount: Money = Money.wons(100)
//      val taxRate = 0.02
//    })
//  println(traitPhone.calculateFee())
//
//  val traitPhone2 = new Phone(
//
//    List(
//      Call(LocalDateTime.of(2017, 1, 2, 10, 0), LocalDateTime.of(2017, 1, 2, 10, 1))
//    ),
//    new RegularPolicy(Money.wons(100), Duration.ofSeconds(10)) with TaxablePolicy with RateDiscountablePolicy {
//      val discountAmount: Money = Money.wons(100)
//      val taxRate = 0.02
//    })
//  //with가 지금 런타임 하는 시점에 결정되었다. 상속은 어느 시점?
//  println(traitPhone2.calculateFee())

  private val policy = new RateDiscountableAndTaxableRegularPolicy(Money.wons(100), Duration.ofSeconds(100), Money.wons(5), 0.05)
  println(policy.amount)
}
