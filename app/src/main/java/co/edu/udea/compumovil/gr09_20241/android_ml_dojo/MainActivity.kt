package co.edu.udea.compumovil.gr09_20241.android_ml_dojo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.edu.udea.compumovil.gr09_20241.android_ml_dojo.ui.CameraScreen
import co.edu.udea.compumovil.gr09_20241.android_ml_dojo.ui.MainScreen
import co.edu.udea.compumovil.gr09_20241.android_ml_dojo.ui.theme.AndroidmldojoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidmldojoTheme {
                MainScreen()
            }
        }
    }
}