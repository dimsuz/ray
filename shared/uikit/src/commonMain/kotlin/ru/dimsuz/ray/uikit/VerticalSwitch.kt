package ru.dimsuz.ray.uikit

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.dimsuz.ray.core.ui.string
import ru.dimsuz.ray.uikit.theme.RayTheme

@Composable
fun VerticalSwitch(
  modifier: Modifier = Modifier,
  elevation: Dp = 0.dp,
  checked: Boolean,
  onCheckedChange: ((Boolean) -> Unit)?
) {
  val shape = RoundedCornerShape(24.dp)
  val switchWidth = 56.dp
  val switchHeight = 100.dp
  val borderSize = 4.dp
  Box(
    modifier = modifier
      .width(switchWidth)
      .height(switchHeight)
      .shadow(elevation, shape)
      .clip(shape)
      .background(RayTheme.extraColors.secondaryBackground, shape)
      .border(width = borderSize, color = RayTheme.colors.surface, shape = shape),
    contentAlignment = Alignment.TopCenter
  ) {
    val thumbMargin = 2.dp
    val thumbSize = switchWidth - borderSize * 2 - thumbMargin * 2
    val yOffset = if (checked) borderSize + thumbMargin else switchHeight - borderSize - thumbMargin - thumbSize
    Box(
      modifier = Modifier
        .offset(y = yOffset)
        .size(thumbSize)
        .background(color = if (checked) RayTheme.colors.primary else RayTheme.colors.primary.copy(alpha = 0.4f), RoundedCornerShape(24.dp))
        .border(width = 1.dp, color = Color.LightGray.copy(alpha = 0.8f), RoundedCornerShape(24.dp)),
      contentAlignment = Alignment.Center,
    ) {
      Text(
        text = if (checked) string("ON") else string("OFF"),
        color = if (checked) RayTheme.colors.onPrimary else RayTheme.colors.onPrimary.copy(alpha = 0.4f),
        style = RayTheme.typography.subtitle1,
      )
    }
  }
}
