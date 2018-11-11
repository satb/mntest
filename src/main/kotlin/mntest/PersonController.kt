package mntest

import mntest.Person
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.validation.Valid

@Controller("/persons")
@Validated
class PersonController {
    @Post("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun search(@Body @Valid person: Person): String {
        return "{\"hi\": \"Hello John\"}"
    }
}
