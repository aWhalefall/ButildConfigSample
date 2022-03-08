package com.kuaidao.butildconfigsample.minapiDebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.kuaidao.butildconfigsample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text=findViewById<TextView>(R.id.text)
        text.text="我是other"

    }

    fun main23PayDebug(){

    }
}