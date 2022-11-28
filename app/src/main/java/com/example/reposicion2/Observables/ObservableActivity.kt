package com.example.reposicion2.Observables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.core.view.get
import androidx.lifecycle.lifecycleScope
import com.example.reposicion2.DataSource.Api.RetrofitInstances
import com.example.reposicion2.DataSource.Model.CurrencyPrime
import com.example.reposicion2.R
import com.example.reposicion2.TradeFragmentViewModel
import com.example.reposicion2.databinding.ActivityObservableBinding
import kotlinx.coroutines.flow.collectLatest
import com.telus.techinterviewcompose.data.Currencies
import com.telus.techinterviewcompose.data.listado
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback
import android.widget.EditText
import android.widget.Toast

class ObservableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityObservableBinding
    private val viewModel: ObservableViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityObservableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ErrorMessage=getString(R.string.Error)


        setListeners()
        binding.button.setOnClickListener{




            viewModel.doCheckIn(binding.spinner.selectedItem.toString(), binding.ingreso.getText().toString(),ErrorMessage)




        }
    }

    private fun setListeners() {

        lifecycleScope.launchWhenStarted {
            viewModel.uiState.collectLatest{state ->
                handleState(state)
            }
        }

    }

    private fun handleState(state: ObservableViewModel.ObservableState){
        when(state){
            is ObservableViewModel.ObservableState.Default -> {
                binding.ingreso.visibility= View.VISIBLE
                binding.spinner.visibility= View.VISIBLE
                binding.button.visibility= View.VISIBLE
                binding.textView.visibility= View.GONE
                binding.progressBar.visibility = View.GONE

            }
            is ObservableViewModel.ObservableState.Erros -> {
                binding.ingreso.visibility= View.VISIBLE
                binding.spinner.visibility= View.VISIBLE
                binding.button.visibility= View.VISIBLE
                binding.textView.visibility= View.GONE
                Toast.makeText(applicationContext, state.message, Toast.LENGTH_LONG).show()
                binding.progressBar.visibility = View.GONE
            }
            is ObservableViewModel.ObservableState.Loading -> {
                binding.ingreso.visibility= View.GONE
                binding.spinner.visibility= View.GONE
                binding.button.visibility= View.GONE
                binding.textView.visibility= View.GONE
                binding.progressBar.visibility = View.VISIBLE
            }
            is ObservableViewModel.ObservableState.Sucess -> {
                binding.ingreso.visibility= View.VISIBLE
                binding.spinner.visibility= View.VISIBLE
                binding.button.visibility= View.VISIBLE
                binding.textView.visibility= View.VISIBLE
                binding.textView.text=state.message
                binding.progressBar.visibility = View.GONE
            }
        }
    }

}