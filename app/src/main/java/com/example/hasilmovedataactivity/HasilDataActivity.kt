package com.example.hasilmovedataactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class HasilDataActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAMALENGKAP = "extra_namalengkap"
        const val EXTRA_NAMAPANGGILAN = "extra_namapanggilan"
        const val EXTRA_NPM = "extra_npm"
        const val EXTRA_ALAMAT = "extra_alamat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hasilactivity_main)

        val tvDataNamaLengkap: TextView = findViewById(R.id.tv_data_nama_lengkap)
        val tvDataNamaPanggilan: TextView = findViewById(R.id.tv_data_nama_panggilan)
        val tvDataNPM: TextView = findViewById(R.id.tv_data_npm)
        val tvDataAlamat: TextView = findViewById(R.id.tv_data_alamat)

        val namalengkap=intent.getStringExtra(EXTRA_NAMALENGKAP)
        val namapanggilan=intent.getStringExtra(EXTRA_NAMAPANGGILAN)
        val npm=intent.getIntExtra(EXTRA_NPM,0)
        val alamat=intent.getStringExtra(EXTRA_ALAMAT)
    }
}