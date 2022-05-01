package ningenme.net.zeus.application.usecase

import ningenme.net.zeus.application.generated.view.HealthGetResponseView
import org.springframework.stereotype.Service

@Service
class HealthGetUsecase {

    fun getView(): HealthGetResponseView {
        return HealthGetResponseView(
            ningenmeMysql = false,
            comicmeMysql = false,
            comproMysql = false
        )
    }
}
