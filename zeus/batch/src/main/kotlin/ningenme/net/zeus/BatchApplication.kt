package ningenme.net.zeus

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableBatchProcessing
open class BatchApplication

fun main(args: Array<String>) {
    runApplication<BatchApplication>(*args)
}
