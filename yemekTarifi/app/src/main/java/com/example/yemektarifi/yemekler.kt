package com.example.yemektarifi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.yemektarifi.databinding.ActivityYemeklerBinding

class yemekler : AppCompatActivity() {
    private lateinit var binding: ActivityYemeklerBinding
    private lateinit var  sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yemekler)
        setupBinding()
    }
    fun setupBinding() {
        binding = ActivityYemeklerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun oneFood(view: View){
        val intent = Intent(applicationContext,oneyemek::class.java)
        startActivity(intent)
    }
    fun twoFood(view: View){
        val intent = Intent(applicationContext,twoYemek::class.java)
        startActivity(intent)
    }
    fun threeFood(view: View){
        val intent = Intent(applicationContext,threeYemek::class.java)
        startActivity(intent)
    }
    fun logOut(view: View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Cıkıs Yap")
        alert.setMessage("Cıkmak istediğinize emin misiniz?")
        alert.setPositiveButton("evet"){dialog,which ->
            Toast.makeText(applicationContext,"Cıkıs Yap", Toast.LENGTH_LONG).show()
        }

        alert.setNegativeButton("hayır"){dialog,which ->
            Toast.makeText(applicationContext,"Cıkıs Yapma", Toast.LENGTH_LONG).show()
        }
        alert.show()

        /*val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)*/

    }
    fun ekleAction(view: View){
        val intent = Intent(applicationContext,yemekEkle::class.java)
        startActivity(intent)
    }

}