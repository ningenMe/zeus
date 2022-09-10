package ningenme.net.zeus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
open class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
