package ru.dimsuz.ray.uikit

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

enum class NavigationIcon { Back, Close, None }

@Composable
fun TopAppBar(
  modifier: Modifier = Modifier,
  title: String,
  navigationIcon: NavigationIcon = NavigationIcon.Back,
  onNavigationIconClick: () -> Unit = {},
) {
  TopAppBar(
    modifier = modifier,
    title = { Text(title) },
    navigationIcon = if (navigationIcon != NavigationIcon.None) {
      { TopAppBarNavigationIcon(navigationIcon, onNavigationIconClick) }
    } else null,
  )
}

@Composable
private fun TopAppBarNavigationIcon(icon: NavigationIcon, onClick: () -> Unit) {
  when (icon) {
    NavigationIcon.Back -> {
      IconButton(onClick = onClick) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "navigation back")
      }
    }
    NavigationIcon.Close -> {
      IconButton(onClick = onClick) {
        Icon(imageVector = Icons.Default.Close, contentDescription = "navigation close")
      }
    }
    NavigationIcon.None -> Unit
  }
}
