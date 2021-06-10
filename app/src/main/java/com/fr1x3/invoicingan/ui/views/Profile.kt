package com.fr1x3.invoicingan.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fr1x3.invoicingan.databinding.ProfileBinding

class Profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = ProfileBinding.inflate(inflater)
        return  binding.root
    }
}