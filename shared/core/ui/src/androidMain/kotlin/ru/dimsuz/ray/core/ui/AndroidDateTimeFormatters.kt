package ru.dimsuz.ray.core.ui

import kotlinx.datetime.LocalDateTime
import java.time.format.DateTimeFormatter

actual fun LocalDateTime.format(pattern: String): String {
  return java.time.LocalDateTime.of(year, monthNumber, dayOfMonth, hour, minute, second, nanosecond)
    .format(DateTimeFormatter.ofPattern(pattern))
}
