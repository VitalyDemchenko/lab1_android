package com.example.lab1_android_demchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.databinding.DataBindingUtil
import com.example.lab1_android_demchenko.databinding.ActivityMainBinding

import androidx.activity.OnBackPressedCallback
import androidx.activity.ComponentActivity
import androidx.activity.addCallback

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

        binding.txtopcat.text = cat1.txtopcat2
        binding.txdowncat.text = cat1.txdowncat2

        binding.txtoplion.text = lion1.txtoplion2
        binding.txdownlion.text = lion1.txdownlion2

    }
    var dog1 = dog()
        // val h = dog1.txtopdog2

    var cat1 = Cat()

    var lion1 = Lion()

    var count1 = 0
    var count2 = 0
fun goAn1(v: View)
{
    startActivity(Intent(this, Animal_1::class.java))
    //startActivity(Intent(this, Animal_1::class.java))


        finish()

   //
}
    fun goAn2(v: View)
    {
        startActivity(Intent(this, Animal_2::class.java))

        finish()
    }

    fun goAn3(v: View)
    {
        startActivity(Intent(this, Animal_3::class.java))

        finish()
    }

    val callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // Ваш код для обробки натискання клавіші "Назад" тут

            // Якщо ви хочете закрити активність, викликайте finish()
            finish()
        }
    }

    // Додаємо зворотний виклик до OnBackPressedDispatcher
    //onBackPressedDispatcher.addCallback(this, callback)
}