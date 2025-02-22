package com.example.mydoce.telas.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mydoce.telas.components.boton
import com.example.mydoce.telas.components.hello
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun telaStart() {
    val systemUiController = rememberSystemUiController()

    // Esconde barra de navegação e força o tema claro
    SideEffect {
        systemUiController.isSystemBarsVisible = false
    }

    MaterialTheme(
        colorScheme = lightColorScheme() // Força o modo claro
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White) // Garante que a tela fique branca
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                hello()
                boton()
            }
        }
    }
}



