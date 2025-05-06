package com.example.dev_4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AnasayfaFragment : Fragment(R.layout.fragment_anasayfa) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonGitA).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)
        }

        view.findViewById<Button>(R.id.buttonGitX).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }
    }
}
