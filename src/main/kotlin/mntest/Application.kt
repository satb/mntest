package mntest

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mntest")
                .mainClass(Application.javaClass)
                .start()
    }
}