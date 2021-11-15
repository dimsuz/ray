package ru.dimsuz.ray

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import ru.dimsuz.ray.list.ui.ListScreen
import ru.dimsuz.ray.uikit.theme.RayTheme

@Composable
fun App() {
  RayTheme {
    val screen = remember { ListScreen() }
    screen.render()
  }
}
