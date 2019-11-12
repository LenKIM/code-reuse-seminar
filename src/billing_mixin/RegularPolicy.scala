package billing_mixin

import java.time.Duration

import money.Money

class RegularPolicy(val amount: Money, val seconds: Duration) extends BasicRatePolicy {

  override protected def calculateCallFee(call: Call): Money = amount.times(call.duration.getSeconds / seconds.getSeconds)
}
