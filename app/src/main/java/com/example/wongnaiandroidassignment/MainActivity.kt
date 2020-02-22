package com.example.wongnaiandroidassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.wongnaiandroidassignment.ui.main.CoinsApi
import com.example.wongnaiandroidassignment.ui.main.CoinsRepository
import com.example.wongnaiandroidassignment.ui.main.MainFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

    }


}
