package com.example.breakingbadapp.api

class Response<T>(
    val id: Number,
    val name: String,
    val birthday: String,
    val occupation: Array<String>,
    val img: String,
    val status: String,
    val nickname: String,
    val portrayed: String,
    val results: T

) {
}