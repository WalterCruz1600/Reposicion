package com.example.reposicion2.DataSource.Api

import com.example.reposicion2.DataSource.util.Constants.Companion.CRYPTO_BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstances {

    companion object{
        private val retrofit by lazy{
            val logging =HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)

            val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()

            Retrofit.Builder()
                .baseUrl(CRYPTO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()



        }

        val api by lazy {
            retrofit.create(CriptoAPI::class.java)
        }
    }

}