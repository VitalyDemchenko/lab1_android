package com.example.lab1_android_demchenko


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.activity.OnBackPressedCallback
import com.example.lab1_android_demchenko.databinding.ActivityAnimal2Binding
//import com.example.lab1_android_demchenko.databinding.ActivityAnimal2Binding

class Animal_2 : AppCompatActivity() {
    private lateinit var binding : ActivityAnimal2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAnimal2Binding.inflate(layoutInflater)
        val contentView = binding.root
        setContentView(contentView)


        binding.txupcat2.text = cat2.txtopcat2
        binding.txdowncat2.text = cat2.txdowncat2
        binding.txextcat2.text = cat2.extended_text_cat2
      //  setContentView(R.layout.activity_animal2)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Ваш код для обробки натискання клавіші "Назад" тут

                // Якщо ви хочете закрити активність, викликайте finish()
                startActivity(Intent(this@Animal_2, MainActivity::class.java))
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
    }
    var cat2 = Cat()

}


