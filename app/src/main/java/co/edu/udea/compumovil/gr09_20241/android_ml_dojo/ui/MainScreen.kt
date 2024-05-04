package co.edu.udea.compumovil.gr09_20241.android_ml_dojo.ui

import android.Manifest
import androidx.compose.runtime.Composable
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MainScreen() {
    val cameraPermissionState: PermissionState = rememberPermissionState(Manifest.permission.CAMERA)

    if (cameraPermissionState.status.isGranted) {
        CameraScreen()
    } else {
        PermissionScreen(
            onRequestPermission = cameraPermissionState::launchPermissionRequest
        )
    }
}