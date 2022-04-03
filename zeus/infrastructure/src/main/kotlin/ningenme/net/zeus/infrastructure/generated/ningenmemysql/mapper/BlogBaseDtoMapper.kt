/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.BlogBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.blogBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.date
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.liked
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.title
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.type
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.BlogBaseDtoDynamicSqlSupport.url
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
interface BlogBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<BlogBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="BlogBaseDtoResult", value = [
        Result(column="url", property="url", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        Result(column="liked", property="liked", jdbcType=JdbcType.INTEGER),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<BlogBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("BlogBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): BlogBaseDto?
}

fun BlogBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, blogBaseDto, completer)

fun BlogBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, blogBaseDto, completer)

fun BlogBaseDtoMapper.deleteByPrimaryKey(url_: String) =
    delete {
        where { url isEqualTo url_ }
    }

fun BlogBaseDtoMapper.insert(row: BlogBaseDto) =
    insert(this::insert, row, blogBaseDto) {
        map(url) toProperty "url"
        map(date) toProperty "date"
        map(type) toProperty "type"
        map(title) toProperty "title"
        map(liked) toProperty "liked"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun BlogBaseDtoMapper.insertMultiple(records: Collection<BlogBaseDto>) =
    insertMultiple(this::insertMultiple, records, blogBaseDto) {
        map(url) toProperty "url"
        map(date) toProperty "date"
        map(type) toProperty "type"
        map(title) toProperty "title"
        map(liked) toProperty "liked"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun BlogBaseDtoMapper.insertMultiple(vararg records: BlogBaseDto) =
    insertMultiple(records.toList())

fun BlogBaseDtoMapper.insertSelective(row: BlogBaseDto) =
    insert(this::insert, row, blogBaseDto) {
        map(url).toPropertyWhenPresent("url", row::url)
        map(date).toPropertyWhenPresent("date", row::date)
        map(type).toPropertyWhenPresent("type", row::type)
        map(title).toPropertyWhenPresent("title", row::title)
        map(liked).toPropertyWhenPresent("liked", row::liked)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(url, date, type, title, liked, deletedTime, createdTime, updatedTime)

fun BlogBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, blogBaseDto, completer)

fun BlogBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, blogBaseDto, completer)

fun BlogBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, blogBaseDto, completer)

fun BlogBaseDtoMapper.selectByPrimaryKey(url_: String) =
    selectOne {
        where { url isEqualTo url_ }
    }

fun BlogBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, blogBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: BlogBaseDto) =
    apply {
        set(url) equalToOrNull row::url
        set(date) equalToOrNull row::date
        set(type) equalToOrNull row::type
        set(title) equalToOrNull row::title
        set(liked) equalToOrNull row::liked
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: BlogBaseDto) =
    apply {
        set(url) equalToWhenPresent row::url
        set(date) equalToWhenPresent row::date
        set(type) equalToWhenPresent row::type
        set(title) equalToWhenPresent row::title
        set(liked) equalToWhenPresent row::liked
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun BlogBaseDtoMapper.updateByPrimaryKey(row: BlogBaseDto) =
    update {
        set(date) equalToOrNull row::date
        set(type) equalToOrNull row::type
        set(title) equalToOrNull row::title
        set(liked) equalToOrNull row::liked
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { url isEqualTo row.url!! }
    }

fun BlogBaseDtoMapper.updateByPrimaryKeySelective(row: BlogBaseDto) =
    update {
        set(date) equalToWhenPresent row::date
        set(type) equalToWhenPresent row::type
        set(title) equalToWhenPresent row::title
        set(liked) equalToWhenPresent row::liked
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { url isEqualTo row.url!! }
    }