package com.mylight.toolsbynavneet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidmads.library.qrgenearator.QRGContents
import androidmads.library.qrgenearator.QRGEncoder
import com.mylight.toolsbynavneet.databinding.ActivityQrCodeGanretarBinding

class QR_code_ganretar : AppCompatActivity() {

    private lateinit var binding: ActivityQrCodeGanretarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_qr_code_ganretar)
        binding = ActivityQrCodeGanretarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.generateBtn.setOnClickListener {
            val text = binding.textField.text.toString()
            val encoder = QRGEncoder(text, null, QRGContents.Type.TEXT, 800)
            binding.qrcode.setImageBitmap(encoder.bitmap)
        }
    }
}