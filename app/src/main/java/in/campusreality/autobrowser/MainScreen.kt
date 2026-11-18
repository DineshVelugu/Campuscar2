package in.campusreality.autobrowser

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class MainScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("CR AutoBrowser is ready for Android Auto.")
            .setTitle("CR AutoBrowser")
            .build()
    }
}
