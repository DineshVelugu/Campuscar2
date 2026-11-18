package in.campusreality.autobrowser

import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

class AutoBrowserCarAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return AutoBrowserSession()
    }
}
