package com.example.breakingbadapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.breakingbadapp.R
import com.example.breakingbadapp.adapters.CharacterListAdapter
import com.example.breakingbadapp.adapters.ViewPagerAdapter
import com.example.breakingbadapp.databinding.FragmentCharacterBinding
import com.example.breakingbadapp.models.Character
import com.example.breakingbadapp.api.api
import com.example.breakingbadapp.services.characterService
import com.example.breakingbadapp.viewModels.CharacterViewModel
import retrofit2.create

class CharacterFragment: Fragment() {

    private var _binding: FragmentCharacterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val characterViewModel = ViewModelProvider(this).get(CharacterViewModel::class.java)


        _binding = FragmentCharacterBinding.inflate(inflater, container, false)

        characterViewModel.characters.observe(viewLifecycleOwner, Observer<MutableList<Character>>{
            characters->
            val adapter = CharacterListAdapter(characters)
            binding.characterList.layoutManager = LinearLayoutManager(activity)
            binding.characterList.adapter = adapter
        })





        return binding.root
    }
}