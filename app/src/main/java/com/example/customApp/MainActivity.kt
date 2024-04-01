package com.example.customApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.customApp.data.OfflinesenDataRepository
import com.example.customApp.data.sensorDataDatabase
import com.example.customApp.ui.home.DashBoard
import com.example.customApp.ui.home.DashBoardViewModel
import com.example.customApp.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: DashBoardViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sensorDataDao = sensorDataDatabase.getDatabase(this).sensorDataDao()
        val repository = OfflinesenDataRepository(sensorDataDao)
        viewModel = DashBoardViewModel(repository) // Initialize your ViewModel
        setContent {
            MyApplicationTheme {
                // Surface is the top-most composable where content will be rendered.
                Surface(modifier = Modifier.fillMaxSize()) {
                    // Uncomment and pass necessary view models or data to SensorDataScreen
                    DashBoard(viewModel = viewModel)
                }
            }
        }
    }
}
