package com.example.reposicion2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.reposicion2.databinding.FragmentTradeBinding
import kotlinx.coroutines.flow.collectLatest

class TradeFragment : Fragment() {
    // TODO: Rename and change types of parameters


    private lateinit var binding: FragmentTradeBinding
    private val viewModel: TradeFragmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTradeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setListeners()
        binding.button.setOnClickListener{
            viewModel.doCheckIn()
        }
    }

    private fun setListeners() {

        lifecycleScope.launchWhenStarted {
            viewModel.uiState.collectLatest{state ->
                handleState(state)
            }
        }

    }

    private fun handleState(state: TradeFragmentViewModel.TradeFragmentState){
        when(state){
            is TradeFragmentViewModel.TradeFragmentState.Default -> {
                binding.ingreso.visibility=View.VISIBLE
                binding.spinner.visibility=View.VISIBLE
                binding.button.visibility=View.VISIBLE
                binding.textView.visibility=View.GONE
                binding.progressBar.visibility =View.GONE

            }
            is TradeFragmentViewModel.TradeFragmentState.Erros -> {
                binding.ingreso.visibility=View.VISIBLE
                binding.spinner.visibility=View.VISIBLE
                binding.button.visibility=View.VISIBLE
                binding.textView.visibility=View.VISIBLE
                binding.textView.text=state.message
                binding.progressBar.visibility =View.GONE
            }
            is TradeFragmentViewModel.TradeFragmentState.Loading -> {
                binding.ingreso.visibility=View.GONE
                binding.spinner.visibility=View.GONE
                binding.button.visibility=View.GONE
                binding.textView.visibility=View.GONE
                binding.progressBar.visibility =View.VISIBLE
            }
            is TradeFragmentViewModel.TradeFragmentState.Sucess -> {
                binding.ingreso.visibility=View.VISIBLE
                binding.spinner.visibility=View.VISIBLE
                binding.button.visibility=View.VISIBLE
                binding.textView.visibility=View.VISIBLE
                binding.textView.text=state.message
                binding.progressBar.visibility =View.GONE
            }
        }
    }

}