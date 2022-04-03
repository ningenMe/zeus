/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.PublisherBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherBaseDtoDynamicSqlSupport.publisherBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherBaseDtoDynamicSqlSupport.publisherId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherBaseDtoDynamicSqlSupport.publisherName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherBaseDtoDynamicSqlSupport.updatedTime
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
interface PublisherBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PublisherBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="PublisherBaseDtoResult", value = [
        Result(column="publisher_id", property="publisherId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="publisher_name", property="publisherName", jdbcType=JdbcType.VARCHAR),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<PublisherBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("PublisherBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): PublisherBaseDto?
}

fun PublisherBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, publisherBaseDto, completer)

fun PublisherBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, publisherBaseDto, completer)

fun PublisherBaseDtoMapper.deleteByPrimaryKey(publisherId_: Int) =
    delete {
        where { publisherId isEqualTo publisherId_ }
    }

fun PublisherBaseDtoMapper.insert(row: PublisherBaseDto) =
    insert(this::insert, row, publisherBaseDto) {
        map(publisherId) toProperty "publisherId"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun PublisherBaseDtoMapper.insertMultiple(records: Collection<PublisherBaseDto>) =
    insertMultiple(this::insertMultiple, records, publisherBaseDto) {
        map(publisherId) toProperty "publisherId"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun PublisherBaseDtoMapper.insertMultiple(vararg records: PublisherBaseDto) =
    insertMultiple(records.toList())

fun PublisherBaseDtoMapper.insertSelective(row: PublisherBaseDto) =
    insert(this::insert, row, publisherBaseDto) {
        map(publisherId).toPropertyWhenPresent("publisherId", row::publisherId)
        map(publisherName).toPropertyWhenPresent("publisherName", row::publisherName)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(publisherId, publisherName, createdTime, updatedTime, deletedTime)

fun PublisherBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, publisherBaseDto, completer)

fun PublisherBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, publisherBaseDto, completer)

fun PublisherBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, publisherBaseDto, completer)

fun PublisherBaseDtoMapper.selectByPrimaryKey(publisherId_: Int) =
    selectOne {
        where { publisherId isEqualTo publisherId_ }
    }

fun PublisherBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, publisherBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: PublisherBaseDto) =
    apply {
        set(publisherId) equalToOrNull row::publisherId
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: PublisherBaseDto) =
    apply {
        set(publisherId) equalToWhenPresent row::publisherId
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun PublisherBaseDtoMapper.updateByPrimaryKey(row: PublisherBaseDto) =
    update {
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { publisherId isEqualTo row.publisherId!! }
    }

fun PublisherBaseDtoMapper.updateByPrimaryKeySelective(row: PublisherBaseDto) =
    update {
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { publisherId isEqualTo row.publisherId!! }
    }