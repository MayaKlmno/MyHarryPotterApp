package com.example.myharrypotterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myharrypotterapp.databinding.YourHogwartsHouseBinding

class YourHogwartsHouse: AppCompatActivity() {
    private lateinit var binding: YourHogwartsHouseBinding

    companion object{
        val TAG = "Houses"
       // val TAG = "YourHogwartsHouse"
    }



    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = YourHogwartsHouseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val house = intent.getParcelableExtra<House>(TAG)

        binding.textViewYourHouseHouse.text =  house?.name
        binding.textViewYourHouseGhost.text = house?.ghost
        binding.textViewYourHouseHeads.text  = house?.heads.toString()
        binding.textViewYourHouseAnimal.text = house?.animal
        binding.textViewYourHouseColors.text = house?.houseColors
        binding.textViewYourHouseTraits.text = house?.traits.toString()

    }
}