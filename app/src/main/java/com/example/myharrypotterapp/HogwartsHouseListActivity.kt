package com.example.myharrypotterapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HogwartsHouseListActivity : AppCompatActivity() {
    // here you should set up the binding and the adaptor
    //TODO: make the adaptor and then write the private lateninit here
    //private lateinit var binding: ActivityMainBinding
    private lateinit var binding: HogwartsHouseListActivity

    companion object{
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = HogwartsHouseListActivity.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       // val sortingHatService = RetrofitHelper.getInstance().create(sortingHatService::class.java)
        // val sortingHatCall = sortingHatService.getAllDaySortingHatData()
    }
}