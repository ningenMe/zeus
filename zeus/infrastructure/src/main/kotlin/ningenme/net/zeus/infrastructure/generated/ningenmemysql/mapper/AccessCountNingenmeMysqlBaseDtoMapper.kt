/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.AccessCountNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.AccessCountNingenmeMysqlBaseDtoDynamicSqlSupport.accessCountId
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.AccessCountNingenmeMysqlBaseDtoDynamicSqlSupport.accessCountNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.AccessCountNingenmeMysqlBaseDtoDynamicSqlSupport.accessTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.AccessCountNingenmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.AccessCountNingenmeMysqlBaseDtoDynamicSqlSupport.updatedTime
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
interface AccessCountNingenmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<AccessCountNingenmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AccessCountNingenmeMysqlBaseDtoResult", value = [
        Result(column="access_count_id", property="accessCountId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="access_time", property="accessTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AccessCountNingenmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AccessCountNingenmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): AccessCountNingenmeMysqlBaseDto?
}

fun AccessCountNingenmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, accessCountNingenmeMysqlBaseDto, completer)

fun AccessCountNingenmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, accessCountNingenmeMysqlBaseDto, completer)

fun AccessCountNingenmeMysqlBaseDtoMapper.deleteByPrimaryKey(accessCountId_: String) =
    delete {
        where { accessCountId isEqualTo accessCountId_ }
    }

fun AccessCountNingenmeMysqlBaseDtoMapper.insert(row: AccessCountNingenmeMysqlBaseDto) =
    insert(this::insert, row, accessCountNingenmeMysqlBaseDto) {
        map(accessCountId) toProperty "accessCountId"
        map(accessTime) toProperty "accessTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AccessCountNingenmeMysqlBaseDtoMapper.insertMultiple(records: Collection<AccessCountNingenmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, accessCountNingenmeMysqlBaseDto) {
        map(accessCountId) toProperty "accessCountId"
        map(accessTime) toProperty "accessTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AccessCountNingenmeMysqlBaseDtoMapper.insertMultiple(vararg records: AccessCountNingenmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun AccessCountNingenmeMysqlBaseDtoMapper.insertSelective(row: AccessCountNingenmeMysqlBaseDto) =
    insert(this::insert, row, accessCountNingenmeMysqlBaseDto) {
        map(accessCountId).toPropertyWhenPresent("accessCountId", row::accessCountId)
        map(accessTime).toPropertyWhenPresent("accessTime", row::accessTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(accessCountId, accessTime, createdTime, updatedTime)

fun AccessCountNingenmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, accessCountNingenmeMysqlBaseDto, completer)

fun AccessCountNingenmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, accessCountNingenmeMysqlBaseDto, completer)

fun AccessCountNingenmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, accessCountNingenmeMysqlBaseDto, completer)

fun AccessCountNingenmeMysqlBaseDtoMapper.selectByPrimaryKey(accessCountId_: String) =
    selectOne {
        where { accessCountId isEqualTo accessCountId_ }
    }

fun AccessCountNingenmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, accessCountNingenmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: AccessCountNingenmeMysqlBaseDto) =
    apply {
        set(accessCountId) equalToOrNull row::accessCountId
        set(accessTime) equalToOrNull row::accessTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: AccessCountNingenmeMysqlBaseDto) =
    apply {
        set(accessCountId) equalToWhenPresent row::accessCountId
        set(accessTime) equalToWhenPresent row::accessTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun AccessCountNingenmeMysqlBaseDtoMapper.updateByPrimaryKey(row: AccessCountNingenmeMysqlBaseDto) =
    update {
        set(accessTime) equalToOrNull row::accessTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { accessCountId isEqualTo row.accessCountId!! }
    }

fun AccessCountNingenmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: AccessCountNingenmeMysqlBaseDto) =
    update {
        set(accessTime) equalToWhenPresent row::accessTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { accessCountId isEqualTo row.accessCountId!! }
    }