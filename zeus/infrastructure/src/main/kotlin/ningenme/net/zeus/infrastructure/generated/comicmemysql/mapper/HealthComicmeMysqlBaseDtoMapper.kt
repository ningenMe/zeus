/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.HealthComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.HealthComicmeMysqlBaseDtoDynamicSqlSupport.healthComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.HealthComicmeMysqlBaseDtoDynamicSqlSupport.id
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
interface HealthComicmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<HealthComicmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="HealthComicmeMysqlBaseDtoResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<HealthComicmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("HealthComicmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): HealthComicmeMysqlBaseDto?
}

fun HealthComicmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, healthComicmeMysqlBaseDto, completer)

fun HealthComicmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, healthComicmeMysqlBaseDto, completer)

fun HealthComicmeMysqlBaseDtoMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun HealthComicmeMysqlBaseDtoMapper.insert(row: HealthComicmeMysqlBaseDto) =
    insert(this::insert, row, healthComicmeMysqlBaseDto) {
        map(id) toProperty "id"
    }

fun HealthComicmeMysqlBaseDtoMapper.insertMultiple(records: Collection<HealthComicmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, healthComicmeMysqlBaseDto) {
        map(id) toProperty "id"
    }

fun HealthComicmeMysqlBaseDtoMapper.insertMultiple(vararg records: HealthComicmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun HealthComicmeMysqlBaseDtoMapper.insertSelective(row: HealthComicmeMysqlBaseDto) =
    insert(this::insert, row, healthComicmeMysqlBaseDto) {
        map(id).toPropertyWhenPresent("id", row::id)
    }

private val columnList = listOf(id)

fun HealthComicmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, healthComicmeMysqlBaseDto, completer)

fun HealthComicmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, healthComicmeMysqlBaseDto, completer)

fun HealthComicmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, healthComicmeMysqlBaseDto, completer)

fun HealthComicmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, healthComicmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: HealthComicmeMysqlBaseDto) =
    apply {
        set(id) equalToOrNull row::id
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: HealthComicmeMysqlBaseDto) =
    apply {
        set(id) equalToWhenPresent row::id
    }