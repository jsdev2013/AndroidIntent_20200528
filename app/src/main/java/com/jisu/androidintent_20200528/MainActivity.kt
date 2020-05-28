package com.jisu.androidintent_20200528

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

        callBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
//            startActivity(myIntent)
        }

        sendToBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("smsto:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_SEND_MULTIPLE, myUri)
            myIntent.putExtra("sms_body","미리 적어둘 내용")
            startActivity(myIntent)
        }
    }
}
