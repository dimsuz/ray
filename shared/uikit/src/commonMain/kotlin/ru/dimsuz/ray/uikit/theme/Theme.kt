package ru.dimsuz.ray.uikit.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

object RayTheme {
  val colors
    @Composable
    get() = MaterialTheme.colors
  val typography
    @Composable
    get() = MaterialTheme.typography
  val shapes
    @Composable
    get() = MaterialTheme.shapes
}

@Composable
fun RayTheme(content: @Composable () -> Unit) {
  MaterialTheme(
    colors = ThemeColors,
    typography = MaterialTheme.typography,
    shapes = MaterialTheme.shapes,
    content
  )
}
