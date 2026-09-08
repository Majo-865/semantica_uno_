package com.example.semantica_uno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()

        }
    }
}
@Composable
fun App() {

    // HEADER
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF1A237E)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "HEADER",
                fontSize = 20.sp,
                color = Color.LightGray
            )
        }


        //MAIN

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    Color(0xFF90CAF9),

                    ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "MAIN",
                fontSize = 20.sp,
                color = Color(0xFF1A237E)
            )
        }

//FOOTER

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF1A237E)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "FOOTER",
                fontSize = 20.sp,
                color = Color.LightGray
            )
        }
    }
}






@Composable
@Preview
fun Vista(){
    App()
}