import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import ru.dimsuz.ray.list.ui.ListScreen

@Composable
fun App() {
  val screen = remember { ListScreen() }
  screen.render()
}
