package com.example.breakingbadapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.breakingbadapp.databinding.FragmentPhraseBinding


class PhraseFragment : Fragment() {

    private var _binding: FragmentPhraseBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPhraseBinding.inflate(inflater, container, false)
        return binding.root
    }

}