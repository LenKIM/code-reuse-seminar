package billing_mixin

import money.Money

class Phone(val calls: List[Call], private val ratePolicy: BasicRatePolicy) {
  def calculateFee(): Money = ratePolicy.calculateFee(this)
}