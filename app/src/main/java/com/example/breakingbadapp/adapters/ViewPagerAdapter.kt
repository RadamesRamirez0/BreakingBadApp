package com.example.breakingbadapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.breakingbadapp.fragments.CharacterFragment
import com.example.breakingbadapp.fragments.PhraseFragment
import com.example.breakingbadapp.fragments.SettingsFragment

private const val NUM_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return CharacterFragment()
            1 -> return PhraseFragment()
        }
        return SettingsFragment()
    }
}