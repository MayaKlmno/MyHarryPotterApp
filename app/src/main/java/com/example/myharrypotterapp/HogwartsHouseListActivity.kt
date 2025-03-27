package com.example.myharrypotterapp

import android.os.Bundle
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
        val hogwartsHouseCall = hogwartsHouseService.getHogwartsHouseData())

        hogwartsHouseCall.enqueue(object: Callback<House> {
            override fun onResponse(call: Call<House>, response: Response<House>){
                // TODO: this is where the code goes for when you get your data
                response.body()
                val hogwartsHouse = response.body()!!

                binding.buttonMainRavenclaw.setOnClickListener{
                    //Houses.filter{it.Houses != "Ravenclaw"}


                }
                binding.buttonMainSlytherin.setOnClickListener{

                }
                binding.buttonMainGryffendor.setOnClickListener{

                }
                binding.buttonMainHufflepuff.setOnClickListener{

                }

            }

            override fun onFailure(p0: Call<House>, p1: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}