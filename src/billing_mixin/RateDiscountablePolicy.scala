package billing_mixin

import money.Money

trait RateDiscountablePolicy extends BasicRatePolicy {

  val discountAmount: Money

  override def calculateFee(phone: Phone): Money = {
    val fee = super.calculateFee(phone)
    fee.minus(discountAmount)
  }
}