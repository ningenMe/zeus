/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.CreatorBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.CreatorBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.CreatorBaseDtoDynamicSqlSupport.creatorBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.CreatorBaseDtoDynamicSqlSupport.creatorId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.CreatorBaseDtoDynamicSqlSupport.creatorName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.CreatorBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.CreatorBaseDtoDynamicSqlSupport.updatedTime
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
interface CreatorBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CreatorBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="CreatorBaseDtoResult", value = [
        Result(column="creator_id", property="creatorId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<CreatorBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("CreatorBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): CreatorBaseDto?
}

fun CreatorBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, creatorBaseDto, completer)

fun CreatorBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, creatorBaseDto, completer)

fun CreatorBaseDtoMapper.deleteByPrimaryKey(creatorId_: Int) =
    delete {
        where { creatorId isEqualTo creatorId_ }
    }

fun CreatorBaseDtoMapper.insert(row: CreatorBaseDto) =
    insert(this::insert, row, creatorBaseDto) {
        map(creatorId) toProperty "creatorId"
        map(creatorName) toProperty "creatorName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun CreatorBaseDtoMapper.insertMultiple(records: Collection<CreatorBaseDto>) =
    insertMultiple(this::insertMultiple, records, creatorBaseDto) {
        map(creatorId) toProperty "creatorId"
        map(creatorName) toProperty "creatorName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun CreatorBaseDtoMapper.insertMultiple(vararg records: CreatorBaseDto) =
    insertMultiple(records.toList())

fun CreatorBaseDtoMapper.insertSelective(row: CreatorBaseDto) =
    insert(this::insert, row, creatorBaseDto) {
        map(creatorId).toPropertyWhenPresent("creatorId", row::creatorId)
        map(creatorName).toPropertyWhenPresent("creatorName", row::creatorName)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(creatorId, creatorName, createdTime, updatedTime, deletedTime)

fun CreatorBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, creatorBaseDto, completer)

fun CreatorBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, creatorBaseDto, completer)

fun CreatorBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, creatorBaseDto, completer)

fun CreatorBaseDtoMapper.selectByPrimaryKey(creatorId_: Int) =
    selectOne {
        where { creatorId isEqualTo creatorId_ }
    }

fun CreatorBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, creatorBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: CreatorBaseDto) =
    apply {
        set(creatorId) equalToOrNull row::creatorId
        set(creatorName) equalToOrNull row::creatorName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: CreatorBaseDto) =
    apply {
        set(creatorId) equalToWhenPresent row::creatorId
        set(creatorName) equalToWhenPresent row::creatorName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun CreatorBaseDtoMapper.updateByPrimaryKey(row: CreatorBaseDto) =
    update {
        set(creatorName) equalToOrNull row::creatorName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { creatorId isEqualTo row.creatorId!! }
    }

fun CreatorBaseDtoMapper.updateByPrimaryKeySelective(row: CreatorBaseDto) =
    update {
        set(creatorName) equalToWhenPresent row::creatorName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { creatorId isEqualTo row.creatorId!! }
    }