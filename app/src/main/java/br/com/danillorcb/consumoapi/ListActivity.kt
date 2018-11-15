package br.com.danillorcb.consumoapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.danillorcb.consumoapi.model.Pokemon
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        rvPokemons.adapter = ListAdapter(listOf(
            Pokemon()

        ), this, {})
        rvPokemons.layoutManager = LinearLayoutManager(this)
    }
}
