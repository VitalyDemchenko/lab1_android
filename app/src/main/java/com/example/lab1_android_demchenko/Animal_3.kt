package com.example.lab1_android_demchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
//import com.example.lab1_android_demchenko.databinding.ActivityAnimal1Binding
import com.example.lab1_android_demchenko.databinding.ActivityAnimal3Binding

class Animal_3 : AppCompatActivity() {
    private lateinit var binding : ActivityAnimal3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_animal3)


        binding = ActivityAnimal3Binding.inflate(layoutInflater)
        val contentView = binding.root
        setContentView(contentView)


        binding.toptextLion.text = lion1.txtoplion2
        binding.downtextLion.text = lion1.txdownlion2
        binding.exttextLion.text = lion1.extended_text_lion2



        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Ваш код для обробки натискання клавіші "Назад" тут

                // Якщо ви хочете закрити активність, викликайте finish()
                startActivity(Intent(this@Animal_3, MainActivity::class.java))
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



    var lion1 = Lion()
}