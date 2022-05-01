package ningenme.net.zeus.infrastructure.repository.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.HealthComicmeMysqlBaseDtoMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface HealthComicmeMysqlMapper : HealthComicmeMysqlBaseDtoMapper {

    @Select(
        "select 1"
    )
    fun select(): Int
}
