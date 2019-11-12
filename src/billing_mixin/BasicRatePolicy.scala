package billing_mixin

import money.Money

abstract class BasicRatePolicy {

  def calculateFee(phone: Phone): Money = phone.calls.map(calculateCallFee).reduce((x, y) => x.plus(y))

  protected def calculateCallFee(call: Call): Money
}
