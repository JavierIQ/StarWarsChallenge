package com.javieriq.starwarsapiapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.javieriq.starwarsapiapp.R
import com.javieriq.starwarsapiapp.databinding.ActivityMainBinding
import com.javieriq.starwarsapiapp.ui.viewmodel.PeopleViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val peopleListViewModel: PeopleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        peopleListViewModel.onCreate()

        peopleListViewModel.peopleListViewModel.observe(this, Observer {
            if (it != null){
                Log.d("DEBUGAPI",it.toString())
            }else{
                Toast.makeText(this,"Error Api Call", Toast.LENGTH_SHORT).show()
            }
        })
    }
}