/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.HealthBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.HealthBaseDtoDynamicSqlSupport.healthBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.HealthBaseDtoDynamicSqlSupport.id
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
interface HealthBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<HealthBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="HealthBaseDtoResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<HealthBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("HealthBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): HealthBaseDto?
}

fun HealthBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, healthBaseDto, completer)

fun HealthBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, healthBaseDto, completer)

fun HealthBaseDtoMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun HealthBaseDtoMapper.insert(row: HealthBaseDto) =
    insert(this::insert, row, healthBaseDto) {
        map(id) toProperty "id"
    }

fun HealthBaseDtoMapper.insertMultiple(records: Collection<HealthBaseDto>) =
    insertMultiple(this::insertMultiple, records, healthBaseDto) {
        map(id) toProperty "id"
    }

fun HealthBaseDtoMapper.insertMultiple(vararg records: HealthBaseDto) =
    insertMultiple(records.toList())

fun HealthBaseDtoMapper.insertSelective(row: HealthBaseDto) =
    insert(this::insert, row, healthBaseDto) {
        map(id).toPropertyWhenPresent("id", row::id)
    }

private val columnList = listOf(id)

fun HealthBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, healthBaseDto, completer)

fun HealthBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, healthBaseDto, completer)

fun HealthBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, healthBaseDto, completer)

fun HealthBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, healthBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: HealthBaseDto) =
    apply {
        set(id) equalToOrNull row::id
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: HealthBaseDto) =
    apply {
        set(id) equalToWhenPresent row::id
    }