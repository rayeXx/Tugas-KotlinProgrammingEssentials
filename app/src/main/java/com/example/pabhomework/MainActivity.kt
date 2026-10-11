package com.example.pabhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstScreen()
        }
    }
}

@Composable
fun MyFirstScreen() {
    // Task 3: Menggunakan Surface dengan warna kustom (selain Cyan)
    Surface(
        color = Color(0xFFF0F4F8),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp) // Nilai akhir pilihan; ubah ke 8.dp dan 48.dp saat mengambil screenshot Task 3
        ) {
            // Task 1: Salam dan deskripsi ide aplikasi
            Text(text = "Hi! I am Rayen.")
            Text(text = "My idea: a Campus Task & Study Habit Tracker.")

            // Task 2: Menggunakan resource gambar sendiri dari res/drawable/my_picture.png
            Image(
                painter = painterResource(id = R.drawable.my_picture),
                contentDescription = "My profile image"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyFirstScreenPreview() {
    MyFirstScreen()
}