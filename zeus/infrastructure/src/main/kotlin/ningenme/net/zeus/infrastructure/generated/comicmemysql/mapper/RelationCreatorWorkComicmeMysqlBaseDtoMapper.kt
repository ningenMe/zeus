/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.RelationCreatorWorkComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.RelationCreatorWorkComicmeMysqlBaseDtoDynamicSqlSupport.creatorId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.RelationCreatorWorkComicmeMysqlBaseDtoDynamicSqlSupport.relationCreatorWorkComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.RelationCreatorWorkComicmeMysqlBaseDtoDynamicSqlSupport.workId
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
interface RelationCreatorWorkComicmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RelationCreatorWorkComicmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="RelationCreatorWorkComicmeMysqlBaseDtoResult", value = [
        Result(column="creator_id", property="creatorId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<RelationCreatorWorkComicmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("RelationCreatorWorkComicmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): RelationCreatorWorkComicmeMysqlBaseDto?
}

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, relationCreatorWorkComicmeMysqlBaseDto, completer)

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, relationCreatorWorkComicmeMysqlBaseDto, completer)

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.deleteByPrimaryKey(creatorId_: Int, workId_: Int) =
    delete {
        where { creatorId isEqualTo creatorId_ }
        and { workId isEqualTo workId_ }
    }

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.insert(row: RelationCreatorWorkComicmeMysqlBaseDto) =
    insert(this::insert, row, relationCreatorWorkComicmeMysqlBaseDto) {
        map(creatorId) toProperty "creatorId"
        map(workId) toProperty "workId"
    }

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.insertMultiple(records: Collection<RelationCreatorWorkComicmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, relationCreatorWorkComicmeMysqlBaseDto) {
        map(creatorId) toProperty "creatorId"
        map(workId) toProperty "workId"
    }

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.insertMultiple(vararg records: RelationCreatorWorkComicmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.insertSelective(row: RelationCreatorWorkComicmeMysqlBaseDto) =
    insert(this::insert, row, relationCreatorWorkComicmeMysqlBaseDto) {
        map(creatorId).toPropertyWhenPresent("creatorId", row::creatorId)
        map(workId).toPropertyWhenPresent("workId", row::workId)
    }

private val columnList = listOf(creatorId, workId)

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, relationCreatorWorkComicmeMysqlBaseDto, completer)

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, relationCreatorWorkComicmeMysqlBaseDto, completer)

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, relationCreatorWorkComicmeMysqlBaseDto, completer)

fun RelationCreatorWorkComicmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, relationCreatorWorkComicmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: RelationCreatorWorkComicmeMysqlBaseDto) =
    apply {
        set(creatorId) equalToOrNull row::creatorId
        set(workId) equalToOrNull row::workId
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: RelationCreatorWorkComicmeMysqlBaseDto) =
    apply {
        set(creatorId) equalToWhenPresent row::creatorId
        set(workId) equalToWhenPresent row::workId
    }