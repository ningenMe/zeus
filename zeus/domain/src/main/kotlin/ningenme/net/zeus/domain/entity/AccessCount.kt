package ningenme.net.zeus.domain.entity

import com.github.guepardoapps.kulid.ULID
import java.time.LocalDateTime

class AccessCount {

    val accessCountId: String
    val accessTime: LocalDateTime

    constructor() {
        accessCountId = ULID.random()
        accessTime = LocalDateTime.now()
    }

    constructor(accessCountId: String, accessTimeString: String) {
        this.accessCountId = ULID.fromString(accessCountId)
        this.accessTime = LocalDateTime.parse(accessTimeString)
    }

}
