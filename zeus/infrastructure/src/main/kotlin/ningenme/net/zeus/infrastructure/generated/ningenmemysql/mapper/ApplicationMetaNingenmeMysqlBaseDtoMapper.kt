/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.time.LocalDateTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.ApplicationMetaNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaNingenmeMysqlBaseDtoDynamicSqlSupport.applicationMetaId
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaNingenmeMysqlBaseDtoDynamicSqlSupport.applicationMetaNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaNingenmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaNingenmeMysqlBaseDtoDynamicSqlSupport.deletedTime
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import org.mybatis.dynamic.sql.util.kotlin.CountCompleter
import org.mybatis.dynamic.sql.util.kotlin.DeleteCompleter
import org.mybatis.dynamic.sql.util.kotlin.KotlinUpdateBuilder
import org.mybatis.dynamic.sql.util.kotlin.SelectCompleter
import org.mybatis.dynamic.sql.util.kotlin.UpdateCompleter
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.countFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.deleteFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insert
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insertMultiple
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectDistinct
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectList
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectOne
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.update
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper

@Mapper
interface ApplicationMetaNingenmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ApplicationMetaNingenmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ApplicationMetaNingenmeMysqlBaseDtoResult", value = [
        Result(column="application_meta_id", property="applicationMetaId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP, id=true),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<ApplicationMetaNingenmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ApplicationMetaNingenmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ApplicationMetaNingenmeMysqlBaseDto?
}

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, applicationMetaNingenmeMysqlBaseDto, completer)

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, applicationMetaNingenmeMysqlBaseDto, completer)

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.deleteByPrimaryKey(applicationMetaId_: String, createdTime_: LocalDateTime) =
    delete {
        where { applicationMetaId isEqualTo applicationMetaId_ }
        and { createdTime isEqualTo createdTime_ }
    }

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.insert(row: ApplicationMetaNingenmeMysqlBaseDto) =
    insert(this::insert, row, applicationMetaNingenmeMysqlBaseDto) {
        map(applicationMetaId) toProperty "applicationMetaId"
        map(createdTime) toProperty "createdTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.insertMultiple(records: Collection<ApplicationMetaNingenmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, applicationMetaNingenmeMysqlBaseDto) {
        map(applicationMetaId) toProperty "applicationMetaId"
        map(createdTime) toProperty "createdTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.insertMultiple(vararg records: ApplicationMetaNingenmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.insertSelective(row: ApplicationMetaNingenmeMysqlBaseDto) =
    insert(this::insert, row, applicationMetaNingenmeMysqlBaseDto) {
        map(applicationMetaId).toPropertyWhenPresent("applicationMetaId", row::applicationMetaId)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(applicationMetaId, createdTime, deletedTime)

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, applicationMetaNingenmeMysqlBaseDto, completer)

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, applicationMetaNingenmeMysqlBaseDto, completer)

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, applicationMetaNingenmeMysqlBaseDto, completer)

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.selectByPrimaryKey(applicationMetaId_: String, createdTime_: LocalDateTime) =
    selectOne {
        where { applicationMetaId isEqualTo applicationMetaId_ }
        and { createdTime isEqualTo createdTime_ }
    }

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, applicationMetaNingenmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ApplicationMetaNingenmeMysqlBaseDto) =
    apply {
        set(applicationMetaId) equalToOrNull row::applicationMetaId
        set(createdTime) equalToOrNull row::createdTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ApplicationMetaNingenmeMysqlBaseDto) =
    apply {
        set(applicationMetaId) equalToWhenPresent row::applicationMetaId
        set(createdTime) equalToWhenPresent row::createdTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.updateByPrimaryKey(row: ApplicationMetaNingenmeMysqlBaseDto) =
    update {
        set(deletedTime) equalToOrNull row::deletedTime
        where { applicationMetaId isEqualTo row.applicationMetaId!! }
        and {createdTime isEqualTo row.createdTime!! }
    }

fun ApplicationMetaNingenmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: ApplicationMetaNingenmeMysqlBaseDto) =
    update {
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { applicationMetaId isEqualTo row.applicationMetaId!! }
        and {createdTime isEqualTo row.createdTime!! }
    }