package in.campusreality.autobrowser

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class AutoBrowserSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return MainScreen(carContext)
    }
}
