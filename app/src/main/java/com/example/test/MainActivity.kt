package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.test.adapter.VideosAdapter
import com.example.test.databinding.ActivityMainBinding
import com.example.test.model.Videos

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView(){
        val rv = binding.rvMain
        rv.layoutManager = GridLayoutManager(this, 2)


        val listVideos = mutableListOf<Videos>()

        for (i in 0 until 20){
            val video = Videos(R.drawable.placeholder_video)
            listVideos.add(video)
        }

        val adapter = VideosAdapter(listVideos, R.layout.videos_item)

        rv.adapter= adapter

    }
}