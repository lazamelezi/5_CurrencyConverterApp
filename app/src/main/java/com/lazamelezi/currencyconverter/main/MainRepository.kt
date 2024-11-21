package com.lazamelezi.currencyconverter.main

import com.lazamelezi.currencyconverter.data.models.CurrencyResponse
import com.lazamelezi.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}