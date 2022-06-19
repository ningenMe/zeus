package ningenme.net.zeus.common.config

import org.springframework.boot.autoconfigure.batch.BatchDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
open class BatchMetaMysqlConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.batchmeta-mysql")
    @BatchDataSource
    open fun dataSource(): DataSource {
        return DataSourceBuilder.create().build()
    }
}
