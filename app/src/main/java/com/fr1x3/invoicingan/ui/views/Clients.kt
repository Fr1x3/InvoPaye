package com.fr1x3.invoicingan.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fr1x3.invoicingan.databinding.ClientsBinding

class Clients : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = ClientsBinding.inflate(inflater)
        return  binding.root
    }
}