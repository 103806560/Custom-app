package com.example.customApp.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier

@Composable
fun DashBoard(viewModel: DashBoardViewModel) {
    val uiState = viewModel.homeUiState.observeAsState(initial = HomeUiState())

    Surface(modifier = Modifier.fillMaxSize()) {
        // Display UI based on uiState
        Text(text = "Number of items: ${uiState.value.itemList.size}")
    }
}
