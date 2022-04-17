package ningenme.net.zeus.application.generated.view

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param applicationMetaId 
 * @param updatedTime 
 */
data class ApplicationMetaLatestGetResponseView(

    @field:JsonProperty("applicationMetaId", required = true) val applicationMetaId: kotlin.String,

    @field:JsonProperty("updatedTime", required = true) val updatedTime: kotlin.String
) {

}

