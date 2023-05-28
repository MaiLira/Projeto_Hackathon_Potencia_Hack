package com.example.test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.model.Videos

class VideosAdapter(private val videos: List<Videos>, @LayoutRes private val layoutId: Int)
    : RecyclerView.Adapter<VideosAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
     fun bind(video: Videos){
         val image: ImageView = itemView.findViewById(R.id.videos_view)
       // image.setImageResource(video.image)

   }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return MyViewHolder(view)    }

    override fun getItemCount(): Int {
        return videos.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val video = videos[position]
        holder.bind(video)
    }

}