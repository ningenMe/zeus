/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.HealthComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.HealthComproMysqlBaseDtoDynamicSqlSupport.healthComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.HealthComproMysqlBaseDtoDynamicSqlSupport.id
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
interface HealthComproMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<HealthComproMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="HealthComproMysqlBaseDtoResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<HealthComproMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("HealthComproMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): HealthComproMysqlBaseDto?
}

fun HealthComproMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, healthComproMysqlBaseDto, completer)

fun HealthComproMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, healthComproMysqlBaseDto, completer)

fun HealthComproMysqlBaseDtoMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun HealthComproMysqlBaseDtoMapper.insert(row: HealthComproMysqlBaseDto) =
    insert(this::insert, row, healthComproMysqlBaseDto) {
        map(id) toProperty "id"
    }

fun HealthComproMysqlBaseDtoMapper.insertMultiple(records: Collection<HealthComproMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, healthComproMysqlBaseDto) {
        map(id) toProperty "id"
    }

fun HealthComproMysqlBaseDtoMapper.insertMultiple(vararg records: HealthComproMysqlBaseDto) =
    insertMultiple(records.toList())

fun HealthComproMysqlBaseDtoMapper.insertSelective(row: HealthComproMysqlBaseDto) =
    insert(this::insert, row, healthComproMysqlBaseDto) {
        map(id).toPropertyWhenPresent("id", row::id)
    }

private val columnList = listOf(id)

fun HealthComproMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, healthComproMysqlBaseDto, completer)

fun HealthComproMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, healthComproMysqlBaseDto, completer)

fun HealthComproMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, healthComproMysqlBaseDto, completer)

fun HealthComproMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, healthComproMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: HealthComproMysqlBaseDto) =
    apply {
        set(id) equalToOrNull row::id
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: HealthComproMysqlBaseDto) =
    apply {
        set(id) equalToWhenPresent row::id
    }