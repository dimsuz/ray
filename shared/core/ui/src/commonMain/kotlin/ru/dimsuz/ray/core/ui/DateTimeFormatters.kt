package ru.dimsuz.ray.core.ui

import kotlinx.datetime.LocalDateTime

expect fun LocalDateTime.format(pattern: String): String
