package com.example.myharrypotterapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myharrypotterapp.databinding.HogwartsHouseListBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HogwartsHouseListActivity : AppCompatActivity() {
    // here you should set up the binding and the adaptor
    //TODO: make the adaptor and then write the private lateninit here
    //private lateinit var binding: ActivityMainBinding
    private lateinit var binding: HogwartsHouseListBinding
    //private lateinit var adapter: HogwartsHouseAdapter

    companion object{
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = HogwartsHouseListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val hogwartsHouseService = RetrofitHelper.getInstance().create(HogwartsHouseService::class.java)
        val hogwartsHouseCall = hogwartsHouseService.getHogwartsHouseData()

        // update service to give back a List<house>
        // update the enqueue to have Call<List<House>

        hogwartsHouseCall.enqueue(object: Callback<List<House>> {
            override fun onResponse(call: Call<List<House>>, response: Response<List<House>>){
                // TODO: this is where the code goes for when you get your data
                var hogwartsHouses = response.body()!!
                Log.d(TAG, "onResponse: $hogwartsHouses")

                binding.buttonMainRavenclaw.setOnClickListener{

                    // filter keeps things that match the condition
                    hogwartsHouses =  hogwartsHouses.filter{it.name == "Ravenclaw"}
                    Log.d(TAG, "onResponse: $hogwartsHouses")

                    // should have a list with one item in it
                    // make the intent to go to the detail ativity
                    val detailIntent = Intent(this@HogwartsHouseListActivity, YourHogwartsHouse::class.java)
                    detailIntent.putExtra(YourHogwartsHouse.TAG, hogwartsHouses[0])
                    // pass an extra with the first item in hte list
                    startActivity(detailIntent)


                }
                binding.buttonMainSlytherin.setOnClickListener{
                    hogwartsHouses = hogwartsHouses.filter { it.name == "Slytherin" }
                    Log.d(TAG, "onResponse: $hogwartsHouses")

                    val detailIntent = Intent(this@HogwartsHouseListActivity, YourHogwartsHouse::class.java)
                    detailIntent.putExtra(YourHogwartsHouse.TAG, hogwartsHouses[0])
                    startActivity(detailIntent)
                }
                binding.buttonMainGryffendor.setOnClickListener{
                    hogwartsHouses = hogwartsHouses.filter {it.name == "Gryffindor"}
                    Log.d(TAG, "onResponse: $hogwartsHouses")

                    val detailIntent = Intent(this@HogwartsHouseListActivity, YourHogwartsHouse::class.java)
                    detailIntent.putExtra(YourHogwartsHouse.TAG, hogwartsHouses[0])
                    startActivity(detailIntent)
                }
                binding.buttonMainHufflepuff.setOnClickListener{
                    hogwartsHouses =  hogwartsHouses.filter{it.name == "Hufflepuff"}
                    Log.d(TAG, "onResponse: $hogwartsHouses")

                    var detailIntent = Intent(this@HogwartsHouseListActivity, YourHogwartsHouse::class.java)
                    detailIntent.putExtra(YourHogwartsHouse.TAG, hogwartsHouses[0])
                    startActivity(detailIntent)
                }

            }

            override fun onFailure(p0: Call<List<House>>, p1: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }


}