package ningenme.net.zeus.application.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/v1/health")
    fun healthGet(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }
}