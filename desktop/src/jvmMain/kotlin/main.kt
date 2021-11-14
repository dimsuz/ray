import androidx.compose.material.MaterialTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application

fun main() = application {
    val state = WindowState(width = 360.dp, height = 640.dp)
    Window(
        state = state,
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
