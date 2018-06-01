package com.br.kotlinfinancas.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.br.kotlinfinancas.R
import com.br.kotlinfinancas.models.Transactions
import kotlinx.android.synthetic.main.transacao_item.view.*

class TransactionsListAdapter (transactions: List<Transactions>,
                               context: Context) : BaseAdapter() {
     private val transactions = transactions
     private val context = context

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val  inflate = LayoutInflater.from(context).inflate(R.layout.transacao_item,
                parent,false)

        val transaction = transactions[position]

        inflate.transactionValue.text = transaction.getValue().toString()

        return inflate
    }

    override fun getItem(position: Int): Transactions {
        return transactions[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transactions.size
    }
}