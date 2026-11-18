package in.campusreality.autobrowser

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Phone UI can be added later if needed
        finish() // For now just a launcher stub
    }
}
