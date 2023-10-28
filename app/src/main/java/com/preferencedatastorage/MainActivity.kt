package com.preferencedatastorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    //https://developer.android.com/codelabs/android-preferences-datastore#2

    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        val dataS = DataStoreManager(this)
        val m = MerchantDetail("em","98","KSR","Hyd","www.","Food","Bala")
        lifecycleScope.launch {
            dataS.saveToDataStore(m)
        }

        dataS.getFromDataStore().asLiveData().observe(this,{
            tv.text = it.getDetails()
        })

    }
}