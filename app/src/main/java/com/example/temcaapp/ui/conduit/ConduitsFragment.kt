package com.example.temcaapp.ui.conduit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.temcaapp.R

class ConduitsFragment : Fragment() {

    companion object {
        fun newInstance() = ConduitsFragment()
    }

    private lateinit var viewModel: ConduitsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.conduits_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConduitsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}