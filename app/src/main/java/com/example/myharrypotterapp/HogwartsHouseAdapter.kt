/*package com.example.myharrypotterapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class HogwartsHouseAdapter (var hogwartsHouseList: List<House>) :
    RecyclerView.Adapter<HogwartsHouseAdapter.ViewHolder>() {
    // have to put something inside the list<>


        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            //TODO: put all of the widgets here
            var buttonGryffedor: Button
            var buttonSlytherin: Button
            var buttonRavenclaw: Button
            var buttonHufflepuff: Button
                // I think that these are only one ones which change, or the ones
                // that something happens to when you click on them
            //ex:
            // var textViewMagnitude: textView

            //TODO: do the inits for the wiring continue (just continue wiring)
            init{
                //ex:
                //textViewMagnitude = view.findViewById(R.id.textView_earthquake_magnitutde)
                buttonGryffedor = view.findViewById(R.id.button_main_gryffendor)
                buttonHufflepuff = view.findViewById(R.id.button_main_hufflepuff)
                buttonRavenclaw = view.findViewById(R.id.button_main_ravenclaw)
                buttonSlytherin = view.findViewById(R.id.button_main_slytherin)
            }
        }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.hogwarts_house_list, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    //TODO: FIX these errors
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.buttonGryffedor.text = "Gryffindor"
        holder.buttonSlytherin.text = "Slytherin"
        holder.buttonHufflepuff.text = "Hufflepuff"
        holder.buttonRavenclaw.text = "Ravenclaw"


        Button.button.setOnClickListener {
            val detailIntent = Intent(context!, YourHogwartsHouse::class.java)
            detailIntent.putExtra(YourHogwartsHouse.EXTEA_FEATURE, House)
            context.startActivity(detailIntent)
        }
    }

}

 */