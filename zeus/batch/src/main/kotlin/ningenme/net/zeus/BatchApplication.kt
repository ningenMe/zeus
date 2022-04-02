package ningenme.net.zeus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BatchApplication

fun main(args: Array<String>) {
	runApplication<BatchApplication>(*args)
}
