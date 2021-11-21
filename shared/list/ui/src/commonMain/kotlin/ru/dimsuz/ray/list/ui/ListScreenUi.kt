package ru.dimsuz.ray.list.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.dimsuz.ray.core.ui.string
import ru.dimsuz.ray.list.ui.component.AlarmCard
import ru.dimsuz.ray.list.ui.component.AlarmListItem
import ru.dimsuz.ray.list.ui.entity.Alarm
import ru.dimsuz.ray.uikit.NavigationIcon
import ru.dimsuz.ray.uikit.PrimaryButton
import ru.dimsuz.ray.uikit.TopAppBar
import ru.dimsuz.ray.uikit.VSpacer
import kotlin.jvm.JvmInline
import kotlin.time.ExperimentalTime

@JvmInline
value class AlarmId(val value: Any)

class Intents(
  val add: () -> Unit,
  val remove: (AlarmId) -> Unit,
)

@ExperimentalTime
@Composable
internal fun ListScreenUi(
  state: ListScreenState,
  intents: Intents,
) {
  Column {
    TopAppBar(title = string("Будильники"), navigationIcon = NavigationIcon.None)
    if (state.alarms.isEmpty()) {
      EmptyScreenState()
    } else {
      ContentState(state.alarms)
    }
  }
}

@Composable
private fun ContentState(alarms: List<Alarm>) {
  LazyColumn(
    modifier = Modifier.fillMaxSize(),
    contentPadding = PaddingValues(start = 24.dp, end = 24.dp, top = 0.dp, bottom = 24.dp)
  ) {
    items(alarms) { item ->
      VSpacer(24.dp)
      AlarmListItem(alarm = item)
    }
  }

}

@Composable
private fun EmptyScreenState() {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
  ) {
    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.disabled) {
      Icon(
        modifier = Modifier.size(120.dp),
        imageVector = Icons.Default.Notifications,
        contentDescription = "alarm clock"
      )
      VSpacer(16.dp)
      Text(
        modifier = Modifier.padding(horizontal = 24.dp),
        text = string("Будильников не установлено"),
      )
      VSpacer(24.dp)
      PrimaryButton(onClick = {}, text = string("Добавить будильник"))
    }
  }
}
