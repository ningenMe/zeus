package ningenme.net.zeus.domain.entity

import com.github.guepardoapps.kulid.ULID
import java.time.LocalDateTime

class AccessCount {

    val accessCountId: String = ULID.random()
    val createdTime: LocalDateTime = LocalDateTime.now()

}
