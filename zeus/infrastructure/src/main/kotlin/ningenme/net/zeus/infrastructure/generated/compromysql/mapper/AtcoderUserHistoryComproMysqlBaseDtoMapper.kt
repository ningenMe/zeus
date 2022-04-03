/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.AtcoderUserHistoryComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.atcoderId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.atcoderUserHistoryComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.contestId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.isRated
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.newRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.oldRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.performance
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.place
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport.updatedTime
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
interface AtcoderUserHistoryComproMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<AtcoderUserHistoryComproMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AtcoderUserHistoryComproMysqlBaseDtoResult", value = [
        Result(column="atcoder_id", property="atcoderId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="contest_id", property="contestId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="is_rated", property="isRated", jdbcType=JdbcType.BIT),
        Result(column="place", property="place", jdbcType=JdbcType.INTEGER),
        Result(column="old_rating", property="oldRating", jdbcType=JdbcType.INTEGER),
        Result(column="new_rating", property="newRating", jdbcType=JdbcType.INTEGER),
        Result(column="performance", property="performance", jdbcType=JdbcType.INTEGER),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AtcoderUserHistoryComproMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AtcoderUserHistoryComproMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): AtcoderUserHistoryComproMysqlBaseDto?
}

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, atcoderUserHistoryComproMysqlBaseDto, completer)

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, atcoderUserHistoryComproMysqlBaseDto, completer)

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.deleteByPrimaryKey(atcoderId_: String, contestId_: String) =
    delete {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestId isEqualTo contestId_ }
    }

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.insert(row: AtcoderUserHistoryComproMysqlBaseDto) =
    insert(this::insert, row, atcoderUserHistoryComproMysqlBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestId) toProperty "contestId"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.insertMultiple(records: Collection<AtcoderUserHistoryComproMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, atcoderUserHistoryComproMysqlBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestId) toProperty "contestId"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.insertMultiple(vararg records: AtcoderUserHistoryComproMysqlBaseDto) =
    insertMultiple(records.toList())

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.insertSelective(row: AtcoderUserHistoryComproMysqlBaseDto) =
    insert(this::insert, row, atcoderUserHistoryComproMysqlBaseDto) {
        map(atcoderId).toPropertyWhenPresent("atcoderId", row::atcoderId)
        map(contestId).toPropertyWhenPresent("contestId", row::contestId)
        map(isRated).toPropertyWhenPresent("isRated", row::isRated)
        map(place).toPropertyWhenPresent("place", row::place)
        map(oldRating).toPropertyWhenPresent("oldRating", row::oldRating)
        map(newRating).toPropertyWhenPresent("newRating", row::newRating)
        map(performance).toPropertyWhenPresent("performance", row::performance)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(atcoderId, contestId, isRated, place, oldRating, newRating, performance, deletedTime, createdTime, updatedTime)

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, atcoderUserHistoryComproMysqlBaseDto, completer)

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, atcoderUserHistoryComproMysqlBaseDto, completer)

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, atcoderUserHistoryComproMysqlBaseDto, completer)

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.selectByPrimaryKey(atcoderId_: String, contestId_: String) =
    selectOne {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestId isEqualTo contestId_ }
    }

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, atcoderUserHistoryComproMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: AtcoderUserHistoryComproMysqlBaseDto) =
    apply {
        set(atcoderId) equalToOrNull row::atcoderId
        set(contestId) equalToOrNull row::contestId
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: AtcoderUserHistoryComproMysqlBaseDto) =
    apply {
        set(atcoderId) equalToWhenPresent row::atcoderId
        set(contestId) equalToWhenPresent row::contestId
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.updateByPrimaryKey(row: AtcoderUserHistoryComproMysqlBaseDto) =
    update {
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestId isEqualTo row.contestId!! }
    }

fun AtcoderUserHistoryComproMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: AtcoderUserHistoryComproMysqlBaseDto) =
    update {
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestId isEqualTo row.contestId!! }
    }