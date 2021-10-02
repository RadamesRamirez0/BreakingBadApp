package com.example.breakingbadapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breakingbadapp.models.Character
import com.example.breakingbadapp.services.characterService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CharacterViewModel:ViewModel() {
    private var _characters = MutableLiveData<MutableList<Character>>()
    val characters: LiveData<MutableList<Character>>
        get() = _characters

    init{
        viewModelScope.launch {
            _characters.value = fetch()
        }
    }

    private suspend fun fetch(): MutableList<Character>{
        return withContext(Dispatchers.IO){
            val characters: MutableList<Character> = characterService.getCharacters().results

            characters
        }

    }
}