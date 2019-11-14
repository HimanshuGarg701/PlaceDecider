package com.example.placedecider

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_items.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>):RecyclerView.Adapter<HobbiesAdapter.MyviewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyviewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_items, p0, false)
        return MyviewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(p0: MyviewHolder, p1: Int) {
        val hobby = hobbies[p1]
        p0.setData(hobby, p1)        // function created by our self
    }

    inner class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(hobby:Hobby? , pos: Int){
            itemView.text0.text = hobby!!.title
        }
    }
}