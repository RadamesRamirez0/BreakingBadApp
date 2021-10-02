package com.example.breakingbadapp.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.breakingbadapp.R
import com.example.breakingbadapp.R.drawable
import com.example.breakingbadapp.databinding.ActivityMainBinding
import com.example.breakingbadapp.databinding.CharacterItemBinding
import com.example.breakingbadapp.fragments.CharacterFragment
import com.example.breakingbadapp.models.Character
import com.google.android.material.internal.ContextUtils.getActivity

class CharacterListAdapter(private val characterList: List<Character>) : RecyclerView.Adapter<CharacterListAdapter.ViewHolder>(){
    inner class ViewHolder(private val binding: CharacterItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(character: Character){
            binding.txvCharacterName.text = character.name
            binding.txvCharacterNickname.text = character.nickname

            Glide.with(binding.root)
                .load(character.imgUrl)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(binding.imgCharacter)



            when(character.status){
                "Deceased"-> {
                    Glide.with(binding.root)
                        .load("https://upload.wikimedia.org/wikipedia/commons/6/6e/Cruz.svg")
                        .centerCrop()
                        .placeholder(R.drawable.ic_launcher_foreground)
                        .into(binding.imgCharacter)
                }
                    "Alive"-> {
                        Glide.with(binding.root)
                            .load("https://upload.wikimedia.org/wikipedia/commons/a/a5/Animated_SVG_Heart.svg")
                            .centerCrop()
                            .placeholder(R.drawable.ic_launcher_foreground)
                            .into(binding.imgCharacter)
                    }
                "Presumed dead" -> {
                    Glide.with(binding.root)
                        .load("https://upload.wikimedia.org/wikipedia/commons/7/7d/Question_opening-closing.svg")
                        .centerCrop()
                        .placeholder(R.drawable.ic_launcher_foreground)
                        .into(binding.imgCharacter)
                }
            }



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CharacterItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    override fun getItemCount(): Int {
        return characterList.count()
    }
}