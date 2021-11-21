package ru.dimsuz.ray.list.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.datetime.LocalDateTime
import ru.dimsuz.ray.core.ui.format
import ru.dimsuz.ray.list.ui.entity.Alarm
import ru.dimsuz.ray.uikit.VSpacer
import ru.dimsuz.ray.uikit.theme.RayTheme

@Composable
internal fun AlarmCard(
  modifier: Modifier = Modifier,
  time: LocalDateTime,
  enabled: Boolean,
  elevation: Dp = 0.dp,
) {
  Surface(
    modifier = modifier.widthIn(min = 72.dp),
    shape = RoundedCornerShape(32.dp),
    color = RayTheme.colors.primary,
    elevation = elevation,
  ) {
    Column(modifier = Modifier.padding(horizontal = 24.dp)) {
      VSpacer(48.dp)
      Text(
        modifier = modifier.align(Alignment.CenterHorizontally),
        style = RayTheme.typography.h3,
        color = if (enabled) RayTheme.colors.onPrimary else RayTheme.colors.onPrimary.copy(alpha = 0.4f),
        text = time.format("HH:mm")
      )
      VSpacer(48.dp)
    }
  }
}
