package com.example.wongnaiandroidassignment.ui.main



import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wongnaiandroidassignment.R
import kotlinx.android.synthetic.main.main_fragment.*


class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var factory: MainViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val api = CoinsApi()    /* Create api */
        val repository = CoinsRepository(api)   /* Create repository */
        factory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,factory).get(MainViewModel::class.java)  /* Create viewmodel */
        viewModel.getCoins() /* Fetch data */
        viewModel.coins.observe(viewLifecycleOwner, Observer { coins ->     /* Observe coins in MainViewModel */
            recycler_view.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = CoinsAdapter(coins)    /* Set adapter */
            }
        })
    }
}
