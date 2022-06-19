package ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.AccessCountNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.AccessCountNingenmeMysqlBaseDtoMapper
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface AccessCountNingenmeMysqlMapper : AccessCountNingenmeMysqlBaseDtoMapper {

    @Insert(
        "<script>" +
            "INSERT INTO access_count (access_count_id, access_time) VALUES "
            + "<foreach item='dto' collection='accessCountDtoList' open='' separator=',' close=''>"
            + "(#{dto.accessCountId},#{dto.accessTime}) "
            + "</foreach>"
            + "</script>"
    )
    fun insertAccessCountList(
        @Param("accessCountDtoList") accessCountDtoList: List<AccessCountNingenmeMysqlBaseDto>
    )
}
