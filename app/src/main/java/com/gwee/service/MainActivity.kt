package com.gwee.service

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.gwee.service.databinding.ActivityMainBinding
import com.idea.report.IReport
import java.util.ServiceLoader

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.report.setOnClickListener {
            val currentTimeMillis = System.currentTimeMillis()
            ServiceLoader.load(IReport::class.java).forEach {
                it.report()
            }
            Log.d("auto service", "cost:${System.currentTimeMillis() - currentTimeMillis}")
        }


    }
}