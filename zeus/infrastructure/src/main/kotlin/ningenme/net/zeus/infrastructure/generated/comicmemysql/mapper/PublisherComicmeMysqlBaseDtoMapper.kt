/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.PublisherComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherComicmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherComicmeMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherComicmeMysqlBaseDtoDynamicSqlSupport.publisherComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherComicmeMysqlBaseDtoDynamicSqlSupport.publisherId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherComicmeMysqlBaseDtoDynamicSqlSupport.publisherName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.PublisherComicmeMysqlBaseDtoDynamicSqlSupport.updatedTime
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
interface PublisherComicmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PublisherComicmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="PublisherComicmeMysqlBaseDtoResult", value = [
        Result(column="publisher_id", property="publisherId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="publisher_name", property="publisherName", jdbcType=JdbcType.VARCHAR),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<PublisherComicmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("PublisherComicmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): PublisherComicmeMysqlBaseDto?
}

fun PublisherComicmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, publisherComicmeMysqlBaseDto, completer)

fun PublisherComicmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, publisherComicmeMysqlBaseDto, completer)

fun PublisherComicmeMysqlBaseDtoMapper.deleteByPrimaryKey(publisherId_: Int) =
    delete {
        where { publisherId isEqualTo publisherId_ }
    }

fun PublisherComicmeMysqlBaseDtoMapper.insert(row: PublisherComicmeMysqlBaseDto) =
    insert(this::insert, row, publisherComicmeMysqlBaseDto) {
        map(publisherId) toProperty "publisherId"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun PublisherComicmeMysqlBaseDtoMapper.insertMultiple(records: Collection<PublisherComicmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, publisherComicmeMysqlBaseDto) {
        map(publisherId) toProperty "publisherId"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun PublisherComicmeMysqlBaseDtoMapper.insertMultiple(vararg records: PublisherComicmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun PublisherComicmeMysqlBaseDtoMapper.insertSelective(row: PublisherComicmeMysqlBaseDto) =
    insert(this::insert, row, publisherComicmeMysqlBaseDto) {
        map(publisherId).toPropertyWhenPresent("publisherId", row::publisherId)
        map(publisherName).toPropertyWhenPresent("publisherName", row::publisherName)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(publisherId, publisherName, createdTime, updatedTime, deletedTime)

fun PublisherComicmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, publisherComicmeMysqlBaseDto, completer)

fun PublisherComicmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, publisherComicmeMysqlBaseDto, completer)

fun PublisherComicmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, publisherComicmeMysqlBaseDto, completer)

fun PublisherComicmeMysqlBaseDtoMapper.selectByPrimaryKey(publisherId_: Int) =
    selectOne {
        where { publisherId isEqualTo publisherId_ }
    }

fun PublisherComicmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, publisherComicmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: PublisherComicmeMysqlBaseDto) =
    apply {
        set(publisherId) equalToOrNull row::publisherId
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: PublisherComicmeMysqlBaseDto) =
    apply {
        set(publisherId) equalToWhenPresent row::publisherId
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun PublisherComicmeMysqlBaseDtoMapper.updateByPrimaryKey(row: PublisherComicmeMysqlBaseDto) =
    update {
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { publisherId isEqualTo row.publisherId!! }
    }

fun PublisherComicmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: PublisherComicmeMysqlBaseDto) =
    update {
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { publisherId isEqualTo row.publisherId!! }
    }