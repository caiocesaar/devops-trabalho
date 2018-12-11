package com.example.logonrmlocal.devopsjob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    val contacts: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        addContacts()

        rv_animal_list.layoutManager = LinearLayoutManager(this)
        rv_animal_list.adapter = ContactAdapter(contacts,this)

    }

    fun addContacts(){
        contacts.add("Caio")
        contacts.add("Caio")
    }

}
