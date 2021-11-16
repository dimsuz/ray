package ru.dimsuz.ray.list.ui

import androidx.compose.runtime.Immutable
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import ru.dimsuz.ray.list.ui.entity.Alarm

@Immutable
data class ListScreenState(
  val alarms: List<Alarm> = listOf(Alarm(AlarmId(0), Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()), enabled = true)),
)
