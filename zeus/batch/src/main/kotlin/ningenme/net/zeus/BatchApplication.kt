package ningenme.net.zeus

import org.springframework.boot.ExitCodeGenerator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.context.annotation.Bean
import kotlin.system.exitProcess

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
open class BatchApplication {
    @Bean
    open fun exitCodeGenerator(): ExitCodeGenerator? {
        return ExitCodeGenerator { 42 }
    }
}

fun main(args: Array<String>) {
    exitProcess(SpringApplication.exit(SpringApplication.run(BatchApplication::class.java, *args)))
}
