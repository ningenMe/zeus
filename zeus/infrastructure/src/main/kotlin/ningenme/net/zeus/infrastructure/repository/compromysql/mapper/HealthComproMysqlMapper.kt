package ningenme.net.zeus.infrastructure.repository.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.HealthComproMysqlBaseDtoMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface HealthComproMysqlMapper : HealthComproMysqlBaseDtoMapper {

    @Select(
        "select 1"
    )
    fun select(): Int
}
