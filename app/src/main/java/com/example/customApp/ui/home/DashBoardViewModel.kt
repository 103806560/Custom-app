package com.example.customApp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.example.customApp.data.senDataRepository
import com.example.customApp.data.sensorData
import kotlinx.coroutines.launch

/**
 * ViewModel to retrieve all items in the Room database.
 */
class DashBoardViewModel(private val senDataRepository: senDataRepository) : ViewModel() {

    private val _homeUiState = MutableLiveData<HomeUiState>()
    val homeUiState: LiveData<HomeUiState> = _homeUiState

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            val dataList = senDataRepository.getAllItemsStream().value ?: emptyList()
            val uiState = HomeUiState(dataList)
            _homeUiState.postValue(uiState)
        }
    }
}

/**
 * Ui State for HomeScreen
 */
data class HomeUiState(val itemList: List<sensorData> = emptyList())
