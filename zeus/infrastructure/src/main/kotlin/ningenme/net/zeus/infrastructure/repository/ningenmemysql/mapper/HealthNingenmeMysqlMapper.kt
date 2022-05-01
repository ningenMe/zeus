package ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.HealthNingenmeMysqlBaseDtoMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface HealthNingenmeMysqlMapper : HealthNingenmeMysqlBaseDtoMapper {

    @Select(
        "select 1"
    )
    fun select(): Int
}
