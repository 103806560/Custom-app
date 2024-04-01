package com.example.customApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.customApp.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() { // Update to ComponentActivity
//    private lateinit var viewModel: SensorDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewModel
//        viewModel = ViewModelProvider(this).get(SensorDataViewModel::class.java)

        setContent {
            MyApplicationTheme {
                // Surface is the top-most composable where content will be rendered.
                Surface(modifier = Modifier.fillMaxSize()) {
//                    SensorDataScreen(viewModel = viewModel)
                }
            }
        }
    }
}
