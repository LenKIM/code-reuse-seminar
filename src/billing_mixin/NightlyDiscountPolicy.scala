package billing_mixin

import java.time.Duration

import money.Money

class NightlyDiscountPolicy(
                             val nightlyAmount: Money,
                             val regularAmount: Money,
                             val seconds: Duration) extends BasicRatePolicy {

  override protected def calculateCallFee(call: Call): Money =
    if (call.from.getHour >= NightltDiscountPolicy.LateNightHour) {
      nightlyAmount.times(call.duration.getSeconds / seconds.getSeconds)
    } else {
      regularAmount.times(call.duration.getSeconds / seconds.getSeconds)
    }
}

object NightltDiscountPolicy {
  val LateNightHour: Integer = 22
}

