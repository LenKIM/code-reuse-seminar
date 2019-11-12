package billing_mixin.mixin

import java.time._

import billing_mixin.{RateDiscountablePolicy, RegularPolicy, TaxablePolicy}
import money.Money

class RateDiscountableAndTaxableRegularPolicy(
    amount: Money, 
    seconds: Duration, 
    val discountAmount: Money,
    val taxRate: Double)
  extends RegularPolicy(amount, seconds)
  with TaxablePolicy 
  with RateDiscountablePolicy
  
class TaxableAndRateDiscountableRegularPolicy(
    amount: Money, 
    seconds: Duration, 
    val discountAmount: Money,
    val taxRate: Double)
  extends RegularPolicy(amount, seconds) 
  with RateDiscountablePolicy 
  with TaxablePolicy
