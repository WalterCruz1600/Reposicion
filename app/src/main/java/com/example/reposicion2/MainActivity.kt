package com.example.reposicion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reposicion2.Observables.ObservableActivity
import com.example.reposicion2.databinding.ActivityMainBinding
import com.example.reposicion2.databinding.ActivityObservableBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()

    }

    private fun setListeners() {
        Intent(this,ObservableActivity::class.java).apply{
            startActivity(this)
        }
    }

    fun showState(state:UiState){
        when(state){
            UiState.Default -> {

            }
            is UiState.Erros -> {
                print(state.message)
            }
            UiState.Loading -> {

            }
            is UiState.Sucess -> {
                print(state.message)
            }
        }
    }

}