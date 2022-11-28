package com.example.reposicion2

sealed class UiState {

    class Sucess(val message:String):UiState()
    object Default: UiState()
    object Loading: UiState()
    class Erros(val message:String): UiState()

}