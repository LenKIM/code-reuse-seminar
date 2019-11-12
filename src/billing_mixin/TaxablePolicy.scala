package billing_mixin

import money.Money

trait TaxablePolicy extends BasicRatePolicy {

  val taxRate: Double

  override def calculateFee(phone: Phone): Money = {
    val fee = super.calculateFee(phone)
    fee.plus(fee.times(taxRate))
  }
}
