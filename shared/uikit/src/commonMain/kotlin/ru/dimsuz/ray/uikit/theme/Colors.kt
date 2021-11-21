package ru.dimsuz.ray.uikit.theme

import androidx.compose.material.lightColors
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

val Amber = Color(0xFFFFD600)
val AmberDark = Color(0xFFC7A500)
val Green = Color(0xFF2E7D32)
val GreenLight = Color(0xFF60AD5E)
val DeepOrange = Color(0xFFDD2C00)
val LightGray = Color(0xFFE2E2E2)

val ThemeColors = lightColors(
  primary = Amber,
  primaryVariant = AmberDark,
  secondary = Green,
  secondaryVariant = GreenLight,
  background = Color.White,
  surface = Color.White,
  error = DeepOrange,
  onPrimary = Color.Black,
  onSecondary = Color.White,
  onBackground = Color.Black,
  onSurface = Color.Black,
  onError = Color.White,
)

val ThemeExtraColors = ExtraColors(
  secondaryBackground = LightGray,
)

@Stable
data class ExtraColors(
  val secondaryBackground: Color
)
