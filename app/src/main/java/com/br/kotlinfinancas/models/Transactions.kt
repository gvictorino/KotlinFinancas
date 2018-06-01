package com.br.kotlinfinancas.models

import java.math.BigDecimal
import java.util.Calendar

class Transactions(value : BigDecimal,
                   category : String,
                   date : Calendar) {

    private val value = value
    private val category = category
    private val date = date

    fun getValue() : BigDecimal{
        return value
    }

}