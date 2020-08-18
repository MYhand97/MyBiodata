package com.myhand.mybiodata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dPribadiBtn.setOnClickListener { callDPribadi() }
        dPendidikanBtn.setOnClickListener { callDPendidikan() }
        kemampuanBtn.setOnClickListener { callKemampuan() }
        pengalamanBtn.setOnClickListener { callPengalaman() }
        exitBtn.setOnClickListener { exitApp() }
    }

    private fun callDPribadi(){
        val intent = Intent(this, DataPribadiActivity::class.java)
        startActivity(intent)
    }

    private fun callDPendidikan(){
        val intent = Intent(this, DataPendidikanActivity::class.java)
        startActivity(intent)
    }

    private fun callKemampuan(){
        val intent = Intent(this, KemampuanActivity::class.java)
        startActivity(intent)
    }

    private fun callPengalaman(){
        val intent = Intent(this, PengalamanActivity::class.java)
        startActivity(intent)
    }

    private fun exitApp(){
        this@MainActivity.finish()
        exitProcess(0)
    }
}
