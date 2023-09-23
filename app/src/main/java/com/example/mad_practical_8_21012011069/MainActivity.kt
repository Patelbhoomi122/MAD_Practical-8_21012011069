package com.example.mad_practical_8_21012011069

import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardView=findViewById<MaterialCardView>(R.id.card2)
        //cardView.visibility=View.GONE
        val createAlarm=findViewById<MaterialButton>(R.id.button_Alarm)
        createAlarm.setOnClickListener {
            //cardView.visibility=View.VISIBLE
            TimePickerDialog(this,{tp,hour,minute->setAlarmTime(hour,minute)},11,0,false).show()
        }

    }

    fun setAlarmTime(hour:Int,minute:Int){
        //cardView.visibility=View.GONE

    }
    fun setAlarm(militime:Long,action:String){
        val intentalarm=Intent(applicationContext,AlarmBroadcastReceiver::class.java)
        val pendingintent=PendingIntent.getBroadcast(applicationContext,4356,intentalarm,PendingIntent.FLAG_UPDATE_CURRENT)
    }
}