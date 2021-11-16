package ru.dimsuz.ray.uikit

import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(
  modifier: Modifier = Modifier,
  text: String,
  onClick: () -> Unit,
) {
  Button(
    modifier = modifier.heightIn(min = 48.dp),
    onClick = onClick
  ) {
    Text(text)
  }
}
