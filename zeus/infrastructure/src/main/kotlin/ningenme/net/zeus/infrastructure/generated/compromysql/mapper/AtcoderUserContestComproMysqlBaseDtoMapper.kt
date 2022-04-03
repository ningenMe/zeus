/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.AtcoderUserContestComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.atcoderId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.atcoderUserContestComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.contestName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.contestNameEn
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.contestScreenName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.contestType
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.endTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.isRated
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.newRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.oldRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.performance
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.place
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport.updatedTime
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
interface AtcoderUserContestComproMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<AtcoderUserContestComproMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AtcoderUserContestComproMysqlBaseDtoResult", value = [
        Result(column="atcoder_id", property="atcoderId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="contest_name_en", property="contestNameEn", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="is_rated", property="isRated", jdbcType=JdbcType.BIT),
        Result(column="place", property="place", jdbcType=JdbcType.INTEGER),
        Result(column="old_rating", property="oldRating", jdbcType=JdbcType.INTEGER),
        Result(column="new_rating", property="newRating", jdbcType=JdbcType.INTEGER),
        Result(column="performance", property="performance", jdbcType=JdbcType.INTEGER),
        Result(column="contest_type", property="contestType", jdbcType=JdbcType.VARCHAR),
        Result(column="contest_screen_name", property="contestScreenName", jdbcType=JdbcType.VARCHAR),
        Result(column="contest_name", property="contestName", jdbcType=JdbcType.VARCHAR),
        Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AtcoderUserContestComproMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AtcoderUserContestComproMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): AtcoderUserContestComproMysqlBaseDto?
}

fun AtcoderUserContestComproMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, atcoderUserContestComproMysqlBaseDto, completer)

fun AtcoderUserContestComproMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, atcoderUserContestComproMysqlBaseDto, completer)

fun AtcoderUserContestComproMysqlBaseDtoMapper.deleteByPrimaryKey(atcoderId_: String, contestNameEn_: String) =
    delete {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestNameEn isEqualTo contestNameEn_ }
    }

fun AtcoderUserContestComproMysqlBaseDtoMapper.insert(row: AtcoderUserContestComproMysqlBaseDto) =
    insert(this::insert, row, atcoderUserContestComproMysqlBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestNameEn) toProperty "contestNameEn"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(contestType) toProperty "contestType"
        map(contestScreenName) toProperty "contestScreenName"
        map(contestName) toProperty "contestName"
        map(endTime) toProperty "endTime"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserContestComproMysqlBaseDtoMapper.insertMultiple(records: Collection<AtcoderUserContestComproMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, atcoderUserContestComproMysqlBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestNameEn) toProperty "contestNameEn"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(contestType) toProperty "contestType"
        map(contestScreenName) toProperty "contestScreenName"
        map(contestName) toProperty "contestName"
        map(endTime) toProperty "endTime"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserContestComproMysqlBaseDtoMapper.insertMultiple(vararg records: AtcoderUserContestComproMysqlBaseDto) =
    insertMultiple(records.toList())

fun AtcoderUserContestComproMysqlBaseDtoMapper.insertSelective(row: AtcoderUserContestComproMysqlBaseDto) =
    insert(this::insert, row, atcoderUserContestComproMysqlBaseDto) {
        map(atcoderId).toPropertyWhenPresent("atcoderId", row::atcoderId)
        map(contestNameEn).toPropertyWhenPresent("contestNameEn", row::contestNameEn)
        map(isRated).toPropertyWhenPresent("isRated", row::isRated)
        map(place).toPropertyWhenPresent("place", row::place)
        map(oldRating).toPropertyWhenPresent("oldRating", row::oldRating)
        map(newRating).toPropertyWhenPresent("newRating", row::newRating)
        map(performance).toPropertyWhenPresent("performance", row::performance)
        map(contestType).toPropertyWhenPresent("contestType", row::contestType)
        map(contestScreenName).toPropertyWhenPresent("contestScreenName", row::contestScreenName)
        map(contestName).toPropertyWhenPresent("contestName", row::contestName)
        map(endTime).toPropertyWhenPresent("endTime", row::endTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(atcoderId, contestNameEn, isRated, place, oldRating, newRating, performance, contestType, contestScreenName, contestName, endTime, deletedTime, createdTime, updatedTime)

fun AtcoderUserContestComproMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, atcoderUserContestComproMysqlBaseDto, completer)

fun AtcoderUserContestComproMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, atcoderUserContestComproMysqlBaseDto, completer)

fun AtcoderUserContestComproMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, atcoderUserContestComproMysqlBaseDto, completer)

fun AtcoderUserContestComproMysqlBaseDtoMapper.selectByPrimaryKey(atcoderId_: String, contestNameEn_: String) =
    selectOne {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestNameEn isEqualTo contestNameEn_ }
    }

fun AtcoderUserContestComproMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, atcoderUserContestComproMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: AtcoderUserContestComproMysqlBaseDto) =
    apply {
        set(atcoderId) equalToOrNull row::atcoderId
        set(contestNameEn) equalToOrNull row::contestNameEn
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(contestType) equalToOrNull row::contestType
        set(contestScreenName) equalToOrNull row::contestScreenName
        set(contestName) equalToOrNull row::contestName
        set(endTime) equalToOrNull row::endTime
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: AtcoderUserContestComproMysqlBaseDto) =
    apply {
        set(atcoderId) equalToWhenPresent row::atcoderId
        set(contestNameEn) equalToWhenPresent row::contestNameEn
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(contestType) equalToWhenPresent row::contestType
        set(contestScreenName) equalToWhenPresent row::contestScreenName
        set(contestName) equalToWhenPresent row::contestName
        set(endTime) equalToWhenPresent row::endTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun AtcoderUserContestComproMysqlBaseDtoMapper.updateByPrimaryKey(row: AtcoderUserContestComproMysqlBaseDto) =
    update {
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(contestType) equalToOrNull row::contestType
        set(contestScreenName) equalToOrNull row::contestScreenName
        set(contestName) equalToOrNull row::contestName
        set(endTime) equalToOrNull row::endTime
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestNameEn isEqualTo row.contestNameEn!! }
    }

fun AtcoderUserContestComproMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: AtcoderUserContestComproMysqlBaseDto) =
    update {
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(contestType) equalToWhenPresent row::contestType
        set(contestScreenName) equalToWhenPresent row::contestScreenName
        set(contestName) equalToWhenPresent row::contestName
        set(endTime) equalToWhenPresent row::endTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestNameEn isEqualTo row.contestNameEn!! }
    }