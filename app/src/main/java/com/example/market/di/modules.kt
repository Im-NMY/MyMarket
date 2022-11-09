package com.example.market.di

import android.util.Log
import com.example.market.data.ProductRepository
import com.example.market.data.ProductRepositoryImpl
import com.example.market.data.network.MarketApi
import com.example.market.data.network.ProductRemoteSource
import com.example.market.domain.Interactions
import com.example.market.ui.MarketViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://run.mocky.io/v3/"

const val API_KEY_MAIN = "654bd15e-b121-49ba-a588-960956b15175"
const val API_KEY_DETAILS = "6c14c560-15c6-4248-b9d2-b4508df7d4f5"
const val API_KEY_BASKET = "53539a72-3c5f-4f30-bbb1-6ca10d42c149"

val netWorkModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor { massage ->
                Log.d("OkHttp", massage)
            }.apply {
                setLevel(HttpLoggingInterceptor.Level.BODY)
            }
        )
            .build()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get<OkHttpClient>())
            .build()
    }

    single<MarketApi> { get<Retrofit>().create(MarketApi::class.java) }

    single { ProductRemoteSource(get<MarketApi>()) }

    single<ProductRepository> { ProductRepositoryImpl(get<ProductRemoteSource>()) }

    single { Interactions(get<ProductRepository>()) }

    viewModel { MarketViewModel(get<Interactions>()) }
}