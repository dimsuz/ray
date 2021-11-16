package ru.dimsuz.ray.list.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.dimsuz.ray.core.ui.format
import ru.dimsuz.ray.list.ui.entity.Alarm
import ru.dimsuz.ray.uikit.VSpacer
import ru.dimsuz.ray.uikit.theme.RayTheme

@Composable
internal fun AlarmCard(
  modifier: Modifier = Modifier,
  alarm: Alarm
) {
  Surface(
    modifier = modifier.widthIn(min = 72.dp),
    shape = RoundedCornerShape(32.dp),
    color = RayTheme.colors.primary,
    elevation = 24.dp,
  ) {
    Column(modifier = Modifier.padding(horizontal = 24.dp)) {
      VSpacer(48.dp)
      Text(
        modifier = modifier.align(Alignment.CenterHorizontally),
        style = RayTheme.typography.h3,
        text = alarm.time.format("HH:mm")
      )
      VSpacer(48.dp)
    }
  }
}
