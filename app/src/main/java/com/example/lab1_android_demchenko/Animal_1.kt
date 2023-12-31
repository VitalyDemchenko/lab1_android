package com.example.lab1_android_demchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import com.example.lab1_android_demchenko.databinding.ActivityAnimal1Binding

class Animal_1 : AppCompatActivity() {
    private lateinit var binding : ActivityAnimal1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAnimal1Binding.inflate(layoutInflater)
        val contentView = binding.root
        setContentView(contentView)


        binding.txupdog2.text = dog2.txtopdog2
        binding.txdowndog2.text = dog2.txdowndog2
        binding.txbigdog2.text = dog2.extended_text_dog2



        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Ваш код для обробки натискання клавіші "Назад" тут

                // Якщо ви хочете закрити активність, викликайте finish()
                startActivity(Intent(this@Animal_1, MainActivity::class.java))
                // Закрити поточну активність
                finish()
            }

        }
       // setContentView(R.layout.activity_animal1)
        onBackPressedDispatcher.addCallback(this, callback)


    }

    fun goMain1(v: View)
    {

        startActivity(Intent(this, MainActivity::class.java))
        finish()
        //onResume(MainActivity::class.java)
    }



   var dog2 = dog()


}