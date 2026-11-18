package in.campusreality.autobrowser

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class MainScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("CR AutoBrowser is ready.")
            .setTitle("Android Auto Browser")
            .setHeaderAction(Action.APP_ICON)
            .addAction(
                Action.Builder()
                    .setTitle("Open Browser")
                    .setOnClickListener {
                        screenManager.push(BrowserScreen(carContext))
                    }
                    .build()
            )
            .build()
    }
}
