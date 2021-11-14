package ru.dimsuz.ray.list.ui

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlin.jvm.JvmInline

@JvmInline
value class AlarmId(val value: String)

class Intents(
  val add: () -> Unit,
  val remove: (AlarmId) -> Unit,
)

@Composable
internal fun ListScreenUi(
  state: ListScreenState,
  intents: Intents,
) {
  var text by remember { mutableStateOf("Hello, World!") }

  Button(onClick = {
    text = "Hello"
  }) {
    Text(text)
  }
}
