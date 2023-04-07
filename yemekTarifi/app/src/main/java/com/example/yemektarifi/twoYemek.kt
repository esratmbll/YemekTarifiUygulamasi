package com.example.yemektarifi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yemektarifi.databinding.ActivityTwoYemekBinding

import com.example.yemektarifi.databinding.ActivityYemeklerBinding

class twoYemek : AppCompatActivity() {
    private lateinit var binding: ActivityTwoYemekBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_twoYemek)
        setupBinding()
    }
    fun setupBinding() {
        binding = ActivityTwoYemekBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun comeBack(view: View){
        val intent = Intent(applicationContext,yemekler::class.java)
        startActivity(intent)
    }
}