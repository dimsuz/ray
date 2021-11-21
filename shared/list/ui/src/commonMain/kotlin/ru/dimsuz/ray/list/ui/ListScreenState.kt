package ru.dimsuz.ray.list.ui

import androidx.compose.runtime.Immutable
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import ru.dimsuz.ray.list.ui.entity.Alarm
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
@Immutable
data class ListScreenState(
  val alarms: List<Alarm> = listOf(
    Alarm(
      id = AlarmId(0),
      time = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()),
      enabled = true
    ),
    Alarm(
      id = AlarmId(1),
      time = Clock.System.now().plus(Duration.hours(3)).toLocalDateTime(TimeZone.currentSystemDefault()),
      enabled = false
    ),
  ),
)
