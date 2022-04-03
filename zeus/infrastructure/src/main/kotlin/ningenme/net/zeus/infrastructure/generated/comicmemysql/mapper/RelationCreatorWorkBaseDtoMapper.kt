/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.RelationCreatorWorkBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.RelationCreatorWorkBaseDtoDynamicSqlSupport.creatorId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.RelationCreatorWorkBaseDtoDynamicSqlSupport.relationCreatorWorkBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.RelationCreatorWorkBaseDtoDynamicSqlSupport.workId
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
interface RelationCreatorWorkBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RelationCreatorWorkBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="RelationCreatorWorkBaseDtoResult", value = [
        Result(column="creator_id", property="creatorId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<RelationCreatorWorkBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("RelationCreatorWorkBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): RelationCreatorWorkBaseDto?
}

fun RelationCreatorWorkBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, relationCreatorWorkBaseDto, completer)

fun RelationCreatorWorkBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, relationCreatorWorkBaseDto, completer)

fun RelationCreatorWorkBaseDtoMapper.deleteByPrimaryKey(creatorId_: Int, workId_: Int) =
    delete {
        where { creatorId isEqualTo creatorId_ }
        and { workId isEqualTo workId_ }
    }

fun RelationCreatorWorkBaseDtoMapper.insert(row: RelationCreatorWorkBaseDto) =
    insert(this::insert, row, relationCreatorWorkBaseDto) {
        map(creatorId) toProperty "creatorId"
        map(workId) toProperty "workId"
    }

fun RelationCreatorWorkBaseDtoMapper.insertMultiple(records: Collection<RelationCreatorWorkBaseDto>) =
    insertMultiple(this::insertMultiple, records, relationCreatorWorkBaseDto) {
        map(creatorId) toProperty "creatorId"
        map(workId) toProperty "workId"
    }

fun RelationCreatorWorkBaseDtoMapper.insertMultiple(vararg records: RelationCreatorWorkBaseDto) =
    insertMultiple(records.toList())

fun RelationCreatorWorkBaseDtoMapper.insertSelective(row: RelationCreatorWorkBaseDto) =
    insert(this::insert, row, relationCreatorWorkBaseDto) {
        map(creatorId).toPropertyWhenPresent("creatorId", row::creatorId)
        map(workId).toPropertyWhenPresent("workId", row::workId)
    }

private val columnList = listOf(creatorId, workId)

fun RelationCreatorWorkBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, relationCreatorWorkBaseDto, completer)

fun RelationCreatorWorkBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, relationCreatorWorkBaseDto, completer)

fun RelationCreatorWorkBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, relationCreatorWorkBaseDto, completer)

fun RelationCreatorWorkBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, relationCreatorWorkBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: RelationCreatorWorkBaseDto) =
    apply {
        set(creatorId) equalToOrNull row::creatorId
        set(workId) equalToOrNull row::workId
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: RelationCreatorWorkBaseDto) =
    apply {
        set(creatorId) equalToWhenPresent row::creatorId
        set(workId) equalToWhenPresent row::workId
    }