package com.example.yemektarifi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yemektarifi.databinding.ActivityOneyemekBinding

import com.example.yemektarifi.databinding.ActivityYemeklerBinding

class oneyemek : AppCompatActivity() {
    private lateinit var binding: ActivityOneyemekBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_oneyemek)
        setupBinding()
    }
    fun setupBinding() {
        binding = ActivityOneyemekBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun comeBack(view: View){
        val intent = Intent(applicationContext,yemekler::class.java)
        startActivity(intent)
    }
}