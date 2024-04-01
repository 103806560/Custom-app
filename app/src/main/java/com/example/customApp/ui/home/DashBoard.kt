package com.example.customApp.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.customApp.R
import com.example.customApp.data.sensorData
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp


@Composable
fun DashBoard(viewModel: DashBoardViewModel) {
    val uiState = viewModel.homeUiState.observeAsState(initial = HomeUiState())

    Surface(modifier = Modifier.fillMaxSize()) {
        // Display UI based on uiState
        Text(text = "Number of items: ${uiState.value.itemList.size}")
    }
}


