package com.example.kotlininicial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlininicial.model.Conference
import com.example.kotlininicial.model.Speaker
import com.google.firebase.firestore.FirebaseFirestore
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}