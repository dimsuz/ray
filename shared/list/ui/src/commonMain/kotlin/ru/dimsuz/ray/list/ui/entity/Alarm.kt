package ru.dimsuz.ray.list.ui.entity

import androidx.compose.runtime.Immutable
import kotlinx.datetime.LocalDateTime
import ru.dimsuz.ray.list.ui.AlarmId

@Immutable
data class Alarm(
  val id: AlarmId,
  val time: LocalDateTime,
  val enabled: Boolean,
)
