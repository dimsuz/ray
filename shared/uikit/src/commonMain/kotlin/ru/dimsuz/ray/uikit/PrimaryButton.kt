package ru.dimsuz.ray.uikit

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PrimaryButton(
  modifier: Modifier = Modifier,
  text: String,
  onClick: () -> Unit,
) {
  Button(
    modifier = modifier,
    onClick = onClick
  ) {
    Text(text)
  }
}
