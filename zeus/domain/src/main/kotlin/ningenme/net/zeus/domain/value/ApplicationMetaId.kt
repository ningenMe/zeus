package ningenme.net.zeus.domain.value

import lombok.Getter
import java.util.*

@Getter
enum class ApplicationMetaId(private val value: String) {
    NET_FRONT("net-front"),
    ZEUS("zeus"),
    NET_BATCH("net-batch"),
    ;

    companion object {
        fun of(value: String): ApplicationMetaId {
            return Arrays
                .stream(values())
                .filter { Objects.equals(it.value, value) }
                .findFirst()
                .orElseThrow()
        }
    }
}

