package com.example.myharrypotterapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myharrypotterapp.databinding.HogwartsHouseListBinding

class HogwartsHouseListActivity : AppCompatActivity() {
    // here you should set up the binding and the adaptor
    //TODO: make the adaptor and then write the private lateninit here
    //private lateinit var binding: ActivityMainBinding
    private lateinit var binding: HogwartsHouseListBinding

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

        val sortingHatService = RetrofitHelper.getInstance().create(sortingHatService::class.java)
        val sortingHatCall = sortingHatService.getAllDaySortingHatData()

        sortingHatCall.enqueue(object: Callback<FeatureCollection> {
            override fun onResponse(call: Call<FeatureCollection>, response: Response<FeatureCollection>){
                // TODO: this is where the code goes for when you get your data
                // create your recyclerView adapeter HERE
                response.body()
                val sortingHat = response.body()!!
                //adapter = SortingHatAdapter(sortingHat.)
            }
        })
    }
}