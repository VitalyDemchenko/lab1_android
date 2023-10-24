package com.example.lab1_android_demchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.databinding.DataBindingUtil
import com.example.lab1_android_demchenko.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val contentView = binding.root
        setContentView(contentView)
        // Встановлюємо значення h для txtopdog TextView через binding об'єкт

        binding.txtopdog.text = dog1.txtopdog2
        binding.txdowndog.text = dog1.txdowndog2

    }
    var dog1 = dog()
        // val h = dog1.txtopdog2






fun goAn1(v: View)
{
    startActivity(Intent(this, Animal_1::class.java))

}


}