package com.example.reposicion2.DataSource.Api

import com.example.reposicion2.DataSource.Model.CurrencyPrime
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Path

interface CriptoAPI {

    @GET("/gh/fawazahmed0/currency-api@1/latest/currencies/eur/{Moneda}.json")
    fun getCrypto(@Path ("Moneda") Moneda:String): Call<HashMap<String,Any>>

    @GET("/gh/fawazahmed0/currency-api@1/latest/currencies/eur/usd.json")
    fun getCoin(@Path  ("usd") usd:Double):Call<CurrencyPrime>
}