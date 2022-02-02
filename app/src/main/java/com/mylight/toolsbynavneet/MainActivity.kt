package com.mylight.toolsbynavneet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var calBtn: Button
    lateinit var qrBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calBtn=findViewById(R.id.calModeBtn)
        qrBtn=findViewById(R.id.QRmodeBtn)



        calBtn.setOnClickListener {
            val intent1 = Intent(this, calculater::class.java)
            startActivity(intent1)
        }
        qrBtn.setOnClickListener {
            val intent2 = Intent(this,QR_code_ganretar::class.java)
            startActivity(intent2)
        }
    }
}