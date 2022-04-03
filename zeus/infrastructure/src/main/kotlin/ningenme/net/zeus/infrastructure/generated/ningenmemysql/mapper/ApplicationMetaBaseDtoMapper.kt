/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.util.Date
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.ApplicationMetaBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaBaseDtoDynamicSqlSupport.applicationMetaBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaBaseDtoDynamicSqlSupport.applicationMetaId
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.ApplicationMetaBaseDtoDynamicSqlSupport.deletedTime
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
interface ApplicationMetaBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ApplicationMetaBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ApplicationMetaBaseDtoResult", value = [
        Result(column="application_meta_id", property="applicationMetaId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP, id=true),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<ApplicationMetaBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ApplicationMetaBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ApplicationMetaBaseDto?
}

fun ApplicationMetaBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, applicationMetaBaseDto, completer)

fun ApplicationMetaBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, applicationMetaBaseDto, completer)

fun ApplicationMetaBaseDtoMapper.deleteByPrimaryKey(applicationMetaId_: String, createdTime_: Date) =
    delete {
        where { applicationMetaId isEqualTo applicationMetaId_ }
        and { createdTime isEqualTo createdTime_ }
    }

fun ApplicationMetaBaseDtoMapper.insert(row: ApplicationMetaBaseDto) =
    insert(this::insert, row, applicationMetaBaseDto) {
        map(applicationMetaId) toProperty "applicationMetaId"
        map(createdTime) toProperty "createdTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ApplicationMetaBaseDtoMapper.insertMultiple(records: Collection<ApplicationMetaBaseDto>) =
    insertMultiple(this::insertMultiple, records, applicationMetaBaseDto) {
        map(applicationMetaId) toProperty "applicationMetaId"
        map(createdTime) toProperty "createdTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ApplicationMetaBaseDtoMapper.insertMultiple(vararg records: ApplicationMetaBaseDto) =
    insertMultiple(records.toList())

fun ApplicationMetaBaseDtoMapper.insertSelective(row: ApplicationMetaBaseDto) =
    insert(this::insert, row, applicationMetaBaseDto) {
        map(applicationMetaId).toPropertyWhenPresent("applicationMetaId", row::applicationMetaId)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(applicationMetaId, createdTime, deletedTime)

fun ApplicationMetaBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, applicationMetaBaseDto, completer)

fun ApplicationMetaBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, applicationMetaBaseDto, completer)

fun ApplicationMetaBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, applicationMetaBaseDto, completer)

fun ApplicationMetaBaseDtoMapper.selectByPrimaryKey(applicationMetaId_: String, createdTime_: Date) =
    selectOne {
        where { applicationMetaId isEqualTo applicationMetaId_ }
        and { createdTime isEqualTo createdTime_ }
    }

fun ApplicationMetaBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, applicationMetaBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ApplicationMetaBaseDto) =
    apply {
        set(applicationMetaId) equalToOrNull row::applicationMetaId
        set(createdTime) equalToOrNull row::createdTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ApplicationMetaBaseDto) =
    apply {
        set(applicationMetaId) equalToWhenPresent row::applicationMetaId
        set(createdTime) equalToWhenPresent row::createdTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun ApplicationMetaBaseDtoMapper.updateByPrimaryKey(row: ApplicationMetaBaseDto) =
    update {
        set(deletedTime) equalToOrNull row::deletedTime
        where { applicationMetaId isEqualTo row.applicationMetaId!! }
        and {createdTime isEqualTo row.createdTime!! }
    }

fun ApplicationMetaBaseDtoMapper.updateByPrimaryKeySelective(row: ApplicationMetaBaseDto) =
    update {
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { applicationMetaId isEqualTo row.applicationMetaId!! }
        and {createdTime isEqualTo row.createdTime!! }
    }