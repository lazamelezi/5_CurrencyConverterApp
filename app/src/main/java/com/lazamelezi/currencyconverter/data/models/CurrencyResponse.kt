package com.lazamelezi.currencyconverter.data.models


data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)