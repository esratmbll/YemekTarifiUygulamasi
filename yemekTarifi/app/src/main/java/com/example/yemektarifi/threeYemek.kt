package com.example.yemektarifi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yemektarifi.databinding.ActivityOneyemekBinding
import com.example.yemektarifi.databinding.ActivityThreeYemekBinding

class threeYemek : AppCompatActivity() {
    private lateinit var binding: ActivityThreeYemekBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_three_yemek)
        setupBinding()
    }
    fun setupBinding() {
        binding = ActivityThreeYemekBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun comeBack(view: View){
        val intent = Intent(applicationContext,yemekler::class.java)
        startActivity(intent)
    }

}