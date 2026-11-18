package in.campusreality.autobrowser

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarIcon
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat

class MainScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("CR AutoBrowser")
            .setTitle("Android Auto Browser")
            .setHeaderAction(Action.APP_ICON)
            .addAction(
                Action.Builder()
                    .setTitle("Open Browser")
                    .setOnClickListener {
                        // Later you can launch WebView or URL list here
                        screenManager.push(BrowserScreen(carContext))
                    }
                    .build()
            )
            .build()
    }
}
