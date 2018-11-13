package mntest

import javax.validation.constraints.Max
import javax.validation.constraints.Min

data class DateOfBirth(
  @get:Min(1) @Max(12) val month:String, 
  @get:Min(1) @Max(31) val date:String,
  @get:Min(1950) @Max(2018) val year:String 
)
