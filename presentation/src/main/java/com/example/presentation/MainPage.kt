package com.example.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainPage(
    modifier : Modifier = Modifier
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "MONKEY HEALTH",
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.pretendard_regular)),
                fontWeight = FontWeight(400),
                color = Color(0xFF902BE9),
            )
        )
    }
}

@Preview
@Composable
fun PreviewMainpage(){
    MainPage()
}