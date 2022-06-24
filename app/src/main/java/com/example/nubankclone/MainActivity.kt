package com.example.nubankclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nubankclone.adapter.AdapterPagamento
import com.example.nubankclone.databinding.ActivityMainBinding
import com.example.nubankclone.model.Pagamentos

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private val listaPagamento: MutableList<Pagamentos> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaIconesPagamentos()
        supportActionBar!!.hide()
        setupRecyclerview()
    }

    private fun setupRecyclerview() {
        val recyclerIconesPagamentos = binding.recyclerIconesPagamentos
        recyclerIconesPagamentos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconesPagamentos.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIconesPagamentos.adapter = adapterPagamento
    }
    private fun listaIconesPagamentos() {
        val icone1 = Pagamentos(R.drawable.ic_pix, "Aréa Pix")
        listaPagamento.add(icone1)
        val icone2 = Pagamentos(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)
        val icone3 = Pagamentos(R.drawable.emprestimo, "Pegar \n Emprestado")
        listaPagamento.add(icone3)
        val icone4 = Pagamentos(R.drawable.transferencia, "Trasnsferir")
        listaPagamento.add(icone4)
        val icone5 = Pagamentos(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)
        val icone6 = Pagamentos(R.drawable.ic_recarga_celular, "Recarga de Celular")
        listaPagamento.add(icone6)
        val icone7 = Pagamentos(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone7)
        val icone8 = Pagamentos(R.drawable.doacao, "Doação")
        listaPagamento.add(icone8)
    }
}
