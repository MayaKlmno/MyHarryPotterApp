package com.example.myharrypotterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.example.myharrypotterapp.databinding.HogwartsHouseListBinding
import com.example.myharrypotterapp.databinding.YourHogwartsHouseBinding

class YourHogwartsHouse: AppCompatActivity() {
    companion object{
        val EXTRA_HOUSE: "House";
        val TAG = "YourHogwartsHouse"
    }

    private lateinit var binding: YourHogwartsHouseBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = YourHogwartsHouseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val house = intent.getParcelableExtra<HogwartsHouseAdapter>(EXTRA_HOUSE)

        //TODO: make an image that corresponds with the house (maybe)
        //var imageid

    }
}