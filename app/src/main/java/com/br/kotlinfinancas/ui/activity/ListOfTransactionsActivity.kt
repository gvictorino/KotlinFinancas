package com.br.kotlinfinancas.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.br.kotlinfinancas.R
import com.br.kotlinfinancas.models.Transactions
import com.br.kotlinfinancas.ui.adapters.TransactionsListAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListOfTransactionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transactions = listOf(Transactions(BigDecimal(20.5),
                "Comida", Calendar.getInstance()),
                Transactions(BigDecimal(100.0),"Economia", Calendar.getInstance()))

        transactionsListView.adapter = TransactionsListAdapter(transactions,this)
    }
}


