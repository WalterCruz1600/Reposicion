package com.example.reposicion2.Observables

import android.provider.Settings.Secure.getString
import android.widget.Spinner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reposicion2.DataSource.Api.RetrofitInstances
import com.example.reposicion2.R
import com.example.reposicion2.TradeFragmentViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import kotlin.math.roundToInt

class ObservableViewModel:ViewModel() {

    private val _uiState: MutableStateFlow<ObservableViewModel.ObservableState> = MutableStateFlow(
        ObservableViewModel.ObservableState.Default)
    val uiState: StateFlow<ObservableViewModel.ObservableState> = _uiState


    sealed class ObservableState{
        object Default: ObservableState()
        object Loading: ObservableState()
        class Sucess(val message:String): ObservableState()
        class Erros(val message:String):ObservableState()
    }

    fun doCheckIn(spinner: String, ingreso:String,ErrorMessage:String){
        viewModelScope.launch{

            _uiState.value = ObservableState.Loading
            delay(2000L)

            try{
                RetrofitInstances.api.getCrypto(spinner).enqueue(object: retrofit2.Callback<HashMap<String,Any>>{



                    override fun onResponse(
                        call: Call<HashMap<String, Any>>,
                        response: Response<HashMap<String, Any>>
                    ) {
                        if(response.isSuccessful){
                            print(response.body())


                            try{
                                var TotalSpinner:String = response.body()?.get(spinner).toString()
                                var TotalIngreso:Double= ingreso.toDouble()

                                var Mul=TotalIngreso*TotalSpinner.toDouble()

                                val MulRed=(Mul * 100.0).roundToInt() / 100.0

                                var mensajeFinal="$MulRed, $spinner"




                                _uiState.value =ObservableState.Sucess(mensajeFinal)
                            }catch(e:Exception){
                                _uiState.value = ObservableState.Erros(ErrorMessage)
                            }

                        }

                    }

                    override fun onFailure(
                        call: Call<HashMap<String, Any>>,
                        t: Throwable
                    ) {
                        _uiState.value = ObservableState.Erros("Error, intentelo de nuevo")
                    }

                })

            }catch(e: Exception){
                _uiState.value = ObservableState.Erros("Error, intentelo de nuevo")
        }


/*
            if((0..5).random() % 2==0){
                _uiState.value =ObservableState.Sucess("Hecho")
            }else{
                _uiState.value = ObservableState.Erros("Error, intentelo de nuevo")
            }
*/
        }
    }


}