package com.example.yemektarifi

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yemektarifi.databinding.ActivityYemekEkleBinding


class yemekEkle : AppCompatActivity() {
    private lateinit var binding: ActivityYemekEkleBinding
    private lateinit var  sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yemek_ekle)
        setupBinding()
    }
    fun setupBinding() {
        binding = ActivityYemekEkleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun saveAction(view: View) {
        /*val sharedPreferences = this.getSharedPreferences("com.example.yemektarifi", MODE_PRIVATE)

        val yemekadi = binding.ageTextView.text.toString().toBooleanStrictOrNull()
        if (yemekadi == null) {
            binding.resultTextView.text = "Doğru değer girmediniz"
        } else {
            binding.resultTextView.text = "Kaydedildi Yaşınız: " + yemekadi
            sharedPreferences.edit().putString(YemekAdı.get,yemekadi).apply()
        }
*/
    }
}