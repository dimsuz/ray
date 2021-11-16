package ru.dimsuz.ray.list.ui.entity

import kotlinx.datetime.LocalDateTime
import ru.dimsuz.ray.list.ui.AlarmId

data class Alarm(
  val id: AlarmId,
  val time: LocalDateTime,
  val enabled: Boolean,
)
