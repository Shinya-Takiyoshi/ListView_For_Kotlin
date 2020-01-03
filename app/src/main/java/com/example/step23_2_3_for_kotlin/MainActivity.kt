package com.example.step23_2_3_for_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView


class MainActivity : AppCompatActivity() {

    // コンパイル時のオブジェクト
    companion object {
        // 定数
        const val LIST_MAX: Int = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val mutableList = mutableListOf<String>()
        for (i in 1..LIST_MAX) {
            mutableList.add("リスト:$i")
        }
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mutableList)
        listView.adapter = adapter
    }
}
