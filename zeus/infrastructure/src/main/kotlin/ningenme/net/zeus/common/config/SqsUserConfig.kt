package ningenme.net.zeus.common.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "zeus-api.sqs.user")
open class SqsUserConfig {
    var accessKeyId: String = ""
    var secretAccessKey: String = ""
}
