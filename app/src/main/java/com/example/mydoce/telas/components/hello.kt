package com.example.mydoce.telas.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun hello(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(800.dp)
            .background(color = Color(0xFFFFFDFD))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .width(250.dp)
                    .height(38.dp)
            ) {
                Text(
                    "Seja Bem vindo",
                    fontSize = 32.sp
                )
            }
            Column (
                modifier = Modifier
                    .width(350.dp)
                    .height(1.dp)
                    .background(color = Color(0xFF000000))
            ){}
        }
    }
}
