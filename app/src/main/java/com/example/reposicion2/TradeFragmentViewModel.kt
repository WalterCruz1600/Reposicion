package com.example.reposicion2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TradeFragmentViewModel:ViewModel() {

    private val _uiState: MutableStateFlow<TradeFragmentState> = MutableStateFlow(TradeFragmentState.Default)
    val uiState:StateFlow<TradeFragmentState> = _uiState

    sealed class TradeFragmentState{
        object Default: TradeFragmentState()
        object Loading: TradeFragmentState()
        class Sucess(val message:String): TradeFragmentState()
        class Erros(val message:String):TradeFragmentState()
    }

    fun doCheckIn(){
        viewModelScope.launch{

            _uiState.value = TradeFragmentState.Loading
            delay(2000L)
            if((0..5).random() % 2==0){
                _uiState.value =TradeFragmentState.Sucess("Hecho")
            }else{
                _uiState.value = TradeFragmentState.Erros("Error, intentelo de nuevo")
            }

        }
    }
}