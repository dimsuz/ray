package ru.dimsuz.ray.list.ui

import androidx.compose.runtime.Immutable

@Immutable
data class ListScreenState(
  val alarms: List<Int> = emptyList(),
)
