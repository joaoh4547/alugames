package com.joaoh4547.alugames

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


/**
 * This method is the entry point of the program. It creates an instance of HttpClient
 * to send an HTTP request to the specified URI "https*/
fun main() {
    val client: HttpClient = HttpClient.newHttpClient()

    //
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"))
        .build()

    val response = client
        .send(request, BodyHandlers.ofString())

    val json = response.body()

    println(json)

}


