package ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.ApplicationMetaNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaNingenmeMysqlBaseDtoMapper
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface ApplicationMetaNingenmeMysqlMapper : ApplicationMetaNingenmeMysqlBaseDtoMapper {

    @Select(
        "SELECT application_meta_id, created_time "
            + "FROM application_meta WHERE application_meta_id = #{applicationMetaId}"
    )
    fun selectByApplicationMetaId(
        @Param("applicationMetaId") applicationMetaId: String
    ): List<ApplicationMetaNingenmeMysqlBaseDto>
}
