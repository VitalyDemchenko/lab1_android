package com.example.lab1_android_demchenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
//import androidx.databinding.DataBindingUtil
import com.example.lab1_android_demchenko.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


fun goAn1(v: View)
{
    startActivity(Intent(this, Animal_1::class.java))

}


}