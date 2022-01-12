package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.dataclasses.CarRecycleViewAdapter
import com.example.myapplication.dataclasses.Cars

class ItemCars: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var CarRecycleViewAdapter: CarRecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_cars)

        recyclerView = findViewById(R.id.recyclerView)
        CarRecycleViewAdapter = CarRecycleViewAdapter(getData())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CarRecycleViewAdapter



    }

    private fun getData(): List<Cars> {
        val list = ArrayList<Cars>()

        list.add(
            Cars(
                1,
                "Nissan Skyline",
                "Fast&Furious",
                "https://static.wikia.nocookie.net/fastandfurious/images/d/d2/Nissan_Skyline_-_2F2F.jpg/revision/latest/scale-to-width-down/1000?cb=20201128161453"
            )
        )

        return list;
    }

}