package ru.dimsuz.ray.list.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class ListScreen {
  private var viewState by mutableStateOf(ListScreenState())
  private val scope = CoroutineScope(SupervisorJob() + CoroutineName("ListScreen") + Dispatchers.Main)

  val intents = Intents(add = {}, remove = {})

  init {
    createLogic(intents)
      .onEach { viewState = it }
      .launchIn(scope)
  }

  fun dispose() {
    scope.cancel()
  }

  fun createLogic(intents: Intents): Flow<ListScreenState> {
    return emptyFlow()
  }


  @Composable
  fun render() {
    ListScreenUi(viewState, intents)
  }
}
