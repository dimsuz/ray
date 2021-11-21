package ru.dimsuz.ray.list.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.datetime.LocalDateTime
import ru.dimsuz.ray.list.ui.entity.Alarm
import ru.dimsuz.ray.uikit.HSpacer
import ru.dimsuz.ray.uikit.VerticalSwitch

@Composable
internal fun AlarmListItem(
  modifier: Modifier = Modifier,
  alarm: Alarm,
) {
  Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
    AlarmCard(time = alarm.time, enabled = alarm.enabled, elevation = if (alarm.enabled) 24.dp else 4.dp)
    HSpacer(32.dp)
    VerticalSwitch(
      elevation = 24.dp,
      checked = alarm.enabled,
      onCheckedChange = {}
    )
  }
}
