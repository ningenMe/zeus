package ningenme.net.zeus.application.usecase

import ningenme.net.zeus.application.generated.view.HealthGetResponseView
import ningenme.net.zeus.domain.service.HealthService
import org.springframework.stereotype.Service

@Service
class HealthGetUsecase(
    private val healthService: HealthService
) {

    fun getView(): HealthGetResponseView {
        return HealthGetResponseView(
            isNingenmeMysqlConnected = healthService.isNingenmeMysqlConnected(),
            isComicmeMysqlConnected = healthService.isComicmeMysqlConnected(),
            isComproMysqlConnected = healthService.isComproMysqlConnected(),
        )
    }
}
