package com.example.breakingbadapp.services


import com.example.breakingbadapp.api.Response
import com.example.breakingbadapp.api.api
import com.example.breakingbadapp.models.Character
import retrofit2.http.GET

interface CharacterService {

    @GET("characters")
    suspend fun getCharacters() : Response<MutableList<Character>>
}
var characterService: CharacterService = api.create<CharacterService>(CharacterService::class.java)