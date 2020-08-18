package com.myhand.mybiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data_pribadi.*

class DataPribadiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_pribadi)

        backBtn.setOnClickListener { finish() }
    }
}
