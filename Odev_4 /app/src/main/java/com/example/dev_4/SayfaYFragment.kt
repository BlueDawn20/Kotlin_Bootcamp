package com.example.dev_4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

class SayfaYFragment : Fragment(R.layout.fragment_sayfa_y) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navOptions = NavOptions.Builder()
            .setPopUpTo(R.id.anasayfaFragment, inclusive = false)
            .build()

        // Geri tuşu davranışı
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.anasayfaFragment, null, navOptions)
            }
        })

        // Buton tıklama ile Anasayfa'ya dönüş
        view.findViewById<Button>(R.id.buttonAnasayfa).setOnClickListener {
            findNavController().navigate(R.id.anasayfaFragment, null, navOptions)
        }
    }
}
