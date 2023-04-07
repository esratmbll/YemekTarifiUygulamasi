package com.example.yemektarifi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.yemektarifi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setupBinding()
      /* // girisyap a basica diger sayfaya gecer
        binding.button3.setOnClickListener{
            intent = Intent(applicationContext,yemekler::class.java)
            startActivity(intent)
        }*/
        Toast.makeText(applicationContext,"Hosgeldiniz",Toast.LENGTH_LONG).show()
    }
    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    // girisyap a basica diger sayfaya gecer
    fun loginAction(view: View){
        val intent = Intent(applicationContext,yemekler::class.java)
        startActivity(intent)
    }
    fun saveAction(view: View){
        val intent = Intent(applicationContext,MainKayitOl::class.java)
        startActivity(intent)
    }

}