package mntest

import javax.validation.Valid

data class Req(
    @get:Valid val persons: Array<Person> = emptyArray()
)
