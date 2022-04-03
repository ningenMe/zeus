package ningenme.net.zeus.common.config

import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import javax.sql.DataSource

@Configuration
@MapperScan(basePackages = ["ningenme.net.zeus.infrastructure.repository.compromysql.mapper"])
open class ComproMysqlConfig {

    companion object {
        private const val DATA_SOURCE = "comproMysqlDataSource"
        private const val DATA_SOURCE_PROPERTIES = "comproMysqlDataSourceProperties"
        private const val DATA_SOURCE_TRANSACTION_MANAGER = "comproMysqlTransactionManager"
        private const val SQL_SESSION_FACTORY = "comproMysqlSqlSessionFactory"
    }

    @Bean(name = [DATA_SOURCE_PROPERTIES])
    @ConfigurationProperties(prefix = "spring.datasource.compro-mysql")
    open fun dataSourceProperties(): DataSourceProperties {
        return DataSourceProperties()
    }

    @Bean(name = [DATA_SOURCE])
    open fun dataSource(
        @Qualifier(DATA_SOURCE_PROPERTIES) dataSourceProperties: DataSourceProperties
    ): DataSource {
        return dataSourceProperties.initializeDataSourceBuilder().build()
    }

    @Bean(name = [DATA_SOURCE_TRANSACTION_MANAGER])
    open fun dataSourceTransactionManager(
        @Qualifier(DATA_SOURCE) dataSource: DataSource
    ): DataSourceTransactionManager {
        return DataSourceTransactionManager(dataSource)
    }

    @Bean(name = [SQL_SESSION_FACTORY])
    open fun sqlSessionFactory(
        @Qualifier(DATA_SOURCE) dataSource: DataSource
    ): SqlSessionFactory? {
        val sqlSessionFactoryBean = SqlSessionFactoryBean()
        sqlSessionFactoryBean.setDataSource(dataSource)
        run {
            val configuration = org.apache.ibatis.session.Configuration()
            configuration.isMapUnderscoreToCamelCase = true
            sqlSessionFactoryBean.setConfiguration(configuration)
        }
        return sqlSessionFactoryBean.getObject()
    }
}
