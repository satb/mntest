package mntest

import javax.validation.constraints.NotEmpty


data class Person(@NotEmpty val name: String = "")
