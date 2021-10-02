package com.example.breakingbadapp.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.breakingbadapp.adapters.ViewPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.breakingbadapp.R
import com.google.android.material.tabs.TabLayout
import com.example.breakingbadapp.adapters.CharacterListAdapter
import com.example.breakingbadapp.databinding.ActivityMainBinding
import com.example.breakingbadapp.databinding.FragmentCharacterBinding
import com.example.breakingbadapp.fragments.*
import com.example.breakingbadapp.models.Character
import com.google.android.material.tabs.TabLayoutMediator

val optionsArray = arrayOf(
    "Characters",
    "Phrase",
    "Settings"
)

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){ tab,position ->
            tab.text = optionsArray[position]
        }.attach()
    }
}