package com.example.lab1_android_demchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.databinding.DataBindingUtil
import com.example.lab1_android_demchenko.databinding.ActivityAnimal1Binding

class Animal_1 : AppCompatActivity() {
    private lateinit var binding : ActivityAnimal1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAnimal1Binding.inflate(layoutInflater)
        val contentView = binding.root
        setContentView(contentView)
        // Встановлюємо значення h для txtopdog TextView через binding об'єкт

        binding.txupdog2.text = dog2.txtopdog2
        binding.txdowndog2.text = dog2.txdowndog2
        binding.txbigdog2.text = dog2.extended_text_dog2
       // setContentView(R.layout.activity_animal1)

    }


   var dog2 = dog()


}