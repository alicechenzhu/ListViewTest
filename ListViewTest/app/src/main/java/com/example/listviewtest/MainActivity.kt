package com.example.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val user = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //初始化测试数据
        initUser()
        val adapter=MyAdapter(this, R.layout.user_list_item_layout,user)
        listview_test.adapter =adapter
    }

    private fun initUser(){
        for(i in 0..10){
            user.add(User("用户test"+i))
        }
    }
}