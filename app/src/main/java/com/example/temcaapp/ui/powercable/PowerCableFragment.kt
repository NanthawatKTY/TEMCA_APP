package com.example.temcaapp.ui.powercable

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.temcaapp.R

class PowerCableFragment : Fragment() {

    companion object {
        fun newInstance() = PowerCableFragment()
    }

    private lateinit var viewModel: PowerCableViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.power_cable_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PowerCableViewModel::class.java)
        // TODO: Use the ViewModel
    }

}