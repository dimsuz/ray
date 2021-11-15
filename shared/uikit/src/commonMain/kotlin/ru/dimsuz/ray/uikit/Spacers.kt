package ru.dimsuz.ray.uikit

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun HSpacer(size: Dp, modifier: Modifier = Modifier) = Spacer(modifier = modifier.width(size))

@Composable
fun VSpacer(size: Dp, modifier: Modifier = Modifier) = Spacer(modifier = modifier.height(size))

@Composable
fun ColumnScope.WSpacer(size: Dp, modifier: Modifier) = Spacer(modifier = modifier.weight(1f))

@Composable
fun RowScope.WSpacer(size: Dp, modifier: Modifier) = Spacer(modifier = modifier.weight(1f))

