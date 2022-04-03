/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.AtcoderUserBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.affiliation
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.atcoderId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.atcoderUserBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.codeforcesId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.country
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.currentPerformance
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.currentRate
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.firstParticipateTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.highestPerformance
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.highestRate
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.lastParticipateTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.rank
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.topcoderId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserBaseDtoDynamicSqlSupport.yukicoderId
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
interface AtcoderUserBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<AtcoderUserBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AtcoderUserBaseDtoResult", value = [
        Result(column="atcoder_id", property="atcoderId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="topcoder_id", property="topcoderId", jdbcType=JdbcType.VARCHAR),
        Result(column="codeforces_id", property="codeforcesId", jdbcType=JdbcType.VARCHAR),
        Result(column="yukicoder_id", property="yukicoderId", jdbcType=JdbcType.VARCHAR),
        Result(column="rank", property="rank", jdbcType=JdbcType.INTEGER),
        Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        Result(column="affiliation", property="affiliation", jdbcType=JdbcType.VARCHAR),
        Result(column="current_rate", property="currentRate", jdbcType=JdbcType.INTEGER),
        Result(column="highest_rate", property="highestRate", jdbcType=JdbcType.INTEGER),
        Result(column="current_performance", property="currentPerformance", jdbcType=JdbcType.INTEGER),
        Result(column="highest_performance", property="highestPerformance", jdbcType=JdbcType.INTEGER),
        Result(column="first_participate_time", property="firstParticipateTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="last_participate_time", property="lastParticipateTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AtcoderUserBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AtcoderUserBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): AtcoderUserBaseDto?
}

fun AtcoderUserBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, atcoderUserBaseDto, completer)

fun AtcoderUserBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, atcoderUserBaseDto, completer)

fun AtcoderUserBaseDtoMapper.deleteByPrimaryKey(atcoderId_: String) =
    delete {
        where { atcoderId isEqualTo atcoderId_ }
    }

fun AtcoderUserBaseDtoMapper.insert(row: AtcoderUserBaseDto) =
    insert(this::insert, row, atcoderUserBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(topcoderId) toProperty "topcoderId"
        map(codeforcesId) toProperty "codeforcesId"
        map(yukicoderId) toProperty "yukicoderId"
        map(rank) toProperty "rank"
        map(country) toProperty "country"
        map(affiliation) toProperty "affiliation"
        map(currentRate) toProperty "currentRate"
        map(highestRate) toProperty "highestRate"
        map(currentPerformance) toProperty "currentPerformance"
        map(highestPerformance) toProperty "highestPerformance"
        map(firstParticipateTime) toProperty "firstParticipateTime"
        map(lastParticipateTime) toProperty "lastParticipateTime"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserBaseDtoMapper.insertMultiple(records: Collection<AtcoderUserBaseDto>) =
    insertMultiple(this::insertMultiple, records, atcoderUserBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(topcoderId) toProperty "topcoderId"
        map(codeforcesId) toProperty "codeforcesId"
        map(yukicoderId) toProperty "yukicoderId"
        map(rank) toProperty "rank"
        map(country) toProperty "country"
        map(affiliation) toProperty "affiliation"
        map(currentRate) toProperty "currentRate"
        map(highestRate) toProperty "highestRate"
        map(currentPerformance) toProperty "currentPerformance"
        map(highestPerformance) toProperty "highestPerformance"
        map(firstParticipateTime) toProperty "firstParticipateTime"
        map(lastParticipateTime) toProperty "lastParticipateTime"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserBaseDtoMapper.insertMultiple(vararg records: AtcoderUserBaseDto) =
    insertMultiple(records.toList())

fun AtcoderUserBaseDtoMapper.insertSelective(row: AtcoderUserBaseDto) =
    insert(this::insert, row, atcoderUserBaseDto) {
        map(atcoderId).toPropertyWhenPresent("atcoderId", row::atcoderId)
        map(topcoderId).toPropertyWhenPresent("topcoderId", row::topcoderId)
        map(codeforcesId).toPropertyWhenPresent("codeforcesId", row::codeforcesId)
        map(yukicoderId).toPropertyWhenPresent("yukicoderId", row::yukicoderId)
        map(rank).toPropertyWhenPresent("rank", row::rank)
        map(country).toPropertyWhenPresent("country", row::country)
        map(affiliation).toPropertyWhenPresent("affiliation", row::affiliation)
        map(currentRate).toPropertyWhenPresent("currentRate", row::currentRate)
        map(highestRate).toPropertyWhenPresent("highestRate", row::highestRate)
        map(currentPerformance).toPropertyWhenPresent("currentPerformance", row::currentPerformance)
        map(highestPerformance).toPropertyWhenPresent("highestPerformance", row::highestPerformance)
        map(firstParticipateTime).toPropertyWhenPresent("firstParticipateTime", row::firstParticipateTime)
        map(lastParticipateTime).toPropertyWhenPresent("lastParticipateTime", row::lastParticipateTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(atcoderId, topcoderId, codeforcesId, yukicoderId, rank, country, affiliation, currentRate, highestRate, currentPerformance, highestPerformance, firstParticipateTime, lastParticipateTime, deletedTime, createdTime, updatedTime)

fun AtcoderUserBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, atcoderUserBaseDto, completer)

fun AtcoderUserBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, atcoderUserBaseDto, completer)

fun AtcoderUserBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, atcoderUserBaseDto, completer)

fun AtcoderUserBaseDtoMapper.selectByPrimaryKey(atcoderId_: String) =
    selectOne {
        where { atcoderId isEqualTo atcoderId_ }
    }

fun AtcoderUserBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, atcoderUserBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: AtcoderUserBaseDto) =
    apply {
        set(atcoderId) equalToOrNull row::atcoderId
        set(topcoderId) equalToOrNull row::topcoderId
        set(codeforcesId) equalToOrNull row::codeforcesId
        set(yukicoderId) equalToOrNull row::yukicoderId
        set(rank) equalToOrNull row::rank
        set(country) equalToOrNull row::country
        set(affiliation) equalToOrNull row::affiliation
        set(currentRate) equalToOrNull row::currentRate
        set(highestRate) equalToOrNull row::highestRate
        set(currentPerformance) equalToOrNull row::currentPerformance
        set(highestPerformance) equalToOrNull row::highestPerformance
        set(firstParticipateTime) equalToOrNull row::firstParticipateTime
        set(lastParticipateTime) equalToOrNull row::lastParticipateTime
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: AtcoderUserBaseDto) =
    apply {
        set(atcoderId) equalToWhenPresent row::atcoderId
        set(topcoderId) equalToWhenPresent row::topcoderId
        set(codeforcesId) equalToWhenPresent row::codeforcesId
        set(yukicoderId) equalToWhenPresent row::yukicoderId
        set(rank) equalToWhenPresent row::rank
        set(country) equalToWhenPresent row::country
        set(affiliation) equalToWhenPresent row::affiliation
        set(currentRate) equalToWhenPresent row::currentRate
        set(highestRate) equalToWhenPresent row::highestRate
        set(currentPerformance) equalToWhenPresent row::currentPerformance
        set(highestPerformance) equalToWhenPresent row::highestPerformance
        set(firstParticipateTime) equalToWhenPresent row::firstParticipateTime
        set(lastParticipateTime) equalToWhenPresent row::lastParticipateTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun AtcoderUserBaseDtoMapper.updateByPrimaryKey(row: AtcoderUserBaseDto) =
    update {
        set(topcoderId) equalToOrNull row::topcoderId
        set(codeforcesId) equalToOrNull row::codeforcesId
        set(yukicoderId) equalToOrNull row::yukicoderId
        set(rank) equalToOrNull row::rank
        set(country) equalToOrNull row::country
        set(affiliation) equalToOrNull row::affiliation
        set(currentRate) equalToOrNull row::currentRate
        set(highestRate) equalToOrNull row::highestRate
        set(currentPerformance) equalToOrNull row::currentPerformance
        set(highestPerformance) equalToOrNull row::highestPerformance
        set(firstParticipateTime) equalToOrNull row::firstParticipateTime
        set(lastParticipateTime) equalToOrNull row::lastParticipateTime
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
    }

fun AtcoderUserBaseDtoMapper.updateByPrimaryKeySelective(row: AtcoderUserBaseDto) =
    update {
        set(topcoderId) equalToWhenPresent row::topcoderId
        set(codeforcesId) equalToWhenPresent row::codeforcesId
        set(yukicoderId) equalToWhenPresent row::yukicoderId
        set(rank) equalToWhenPresent row::rank
        set(country) equalToWhenPresent row::country
        set(affiliation) equalToWhenPresent row::affiliation
        set(currentRate) equalToWhenPresent row::currentRate
        set(highestRate) equalToWhenPresent row::highestRate
        set(currentPerformance) equalToWhenPresent row::currentPerformance
        set(highestPerformance) equalToWhenPresent row::highestPerformance
        set(firstParticipateTime) equalToWhenPresent row::firstParticipateTime
        set(lastParticipateTime) equalToWhenPresent row::lastParticipateTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
    }