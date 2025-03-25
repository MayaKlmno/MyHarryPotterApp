package com.example.myharrypotterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

        val house = intent.getParcelableExtra<House>(EXTRA_HOUSE)

        binding.textViewYourHouseHouse.text =  house?.name
        binding.textViewYourHouseGhost.text = house?.ghost
        binding.textViewYourHouseHeads.text  = house?.heads.toString()
        binding.textViewYourHouseAnimal.text = house?.animal
        binding.textViewYourHouseColors.text = house?.houseColors
        binding.textViewYourHouseTraits.text = house?.traits.toString()

    }
}