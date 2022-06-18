package com.example.mapsassignment


import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // private lateinit var binding : null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "University Of Kelaniya", "University Of Colombo", "University Of Moratuwa",
            "University Of Sri Jayaeardanapura", "University Of Peradeniya", "University Of Ruhuna",
            "University Of Sabaragamuwa", "University Of Jaffna"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.uniList)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener(OnItemClickListener { adapterView, view, i, l ->

            val myItems = adapterView.getItemAtPosition(i) as String
            Toast.makeText(view.context, myItems, Toast.LENGTH_SHORT).show()
            if (i == 0) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragment()).commit()
            }
            else if (i==1) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuoc()).commit()
            }
            else if (i==2) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuom()).commit()
            }
            else if (i==3) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuoj()).commit()
            }
            else if (i==4) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuop()).commit()
            }
            else if (i==5) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuor()).commit()
            }
            else if (i==6) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuos()).commit()
            }
            else if (i==7) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, MapsFragmentuojaff()).commit()
            }

        })


    }

    fun fragmentMethod() {
        Toast.makeText(this@MainActivity, "Method called From Fragment",
            Toast.LENGTH_LONG).show()
    }



}