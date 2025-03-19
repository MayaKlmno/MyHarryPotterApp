package com.example.myharrypotterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HogwartsHouseAdapter (var hogwartsHouseList: List<>) :
    RecyclerView.Adapter<HogwartsHouseAdapter.ViewHolder>() {
    // have to put something inside the list<>


        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            //TODO: put all of the widgets here
                // I think that these are only one ones which change, or the ones
                // that something happens to when you click on them
            //ex:
            // var textViewMagnitude: textView

            //TODO: do the inits for the wiring continue (just continue wiring)
            init{
                //ex:
                //textViewMagnitude = view.findViewById(R.id.textView_earthquake_magnitutde)
            }
        }

        override fun onCreateViewHolder(viwGroup: ViewGroup, viewType: Int): ViewHolder {
            //TODO: get this to stop being red
            // --> such as add a few things needed
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_something, viewGroup, false)
            return ViewHolder(view)
        }

        //TODO: when I put somethingList it is a placeholder for the actual list later
        override fun getItemCOunt(): Int{
            return somethingList.size
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //TODO: make the inside of this/finish it
    }

}