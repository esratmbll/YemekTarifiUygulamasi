package com.example.yemektarifi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.yemektarifi.databinding.ActivityMainKayitOlBinding

class MainKayitOl : AppCompatActivity() {
    private lateinit var binding: ActivityMainKayitOlBinding
    private lateinit var  sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main_kayit_ol)
        setupBinding()
    }
    fun setupBinding() {
        binding = ActivityMainKayitOlBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun BackAction(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
    fun saveAction(view: View){
        var kullaniciAdi = binding.KayitKullaniciText.text.toString()
        var kullaniciParola = binding.parolakayitText.text.toString()

        sharedPreferences = this.getSharedPreferences("veriler", MODE_PRIVATE) // kayıt icin
        var editor = sharedPreferences.edit()
        //veri ekleme kodu
        editor.putString("kullanici","${kullaniciAdi}").apply()
        editor.putString("Sifre","${kullaniciParola}").apply()
        // ekrana mesaj ver
        Toast.makeText(applicationContext,"Tebrikler... Başarılı bir sekilde kayıt yaptınız.",Toast.LENGTH_LONG).show()

    }
}