package billing_mixin

import java.time._

case class Call(from: LocalDateTime, to: LocalDateTime) {
  def duration: Duration = Duration.between(from, to)  
}