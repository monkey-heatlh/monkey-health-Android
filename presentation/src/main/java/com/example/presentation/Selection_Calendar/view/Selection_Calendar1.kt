package com.example.presentation.Selection_Calendar.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.presentation.R

@Composable
fun Selection_Calendar1(
    modifier: Modifier = Modifier
) {
    val days = (1..31).toList()
    val weeks = listOf("MON", "TUE", "WED", "THS", "FRI", "SAT", "SUN")
    val selectedDay = remember { mutableStateOf(14) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 62.5.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_down),
                contentDescription = "뒤로가기",
                modifier = Modifier
                    .size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "뒤로",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(46.dp))

        Column(
            modifier = Modifier
                .width(345.dp)
                .height(38.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "10월",
                style = TextStyle(
                    fontSize = 32.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF111111),
                    textAlign = TextAlign.Center,
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            weeks.forEach {
                Text(
                    text = it,
                    fontSize = 14.sp,
                    color = Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(7),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(days) { day ->
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(4.dp)
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(
                            if (day == selectedDay.value) Color.White else Color(0xFF902BE9)
                        )
                        .border(
                            width = if (day == selectedDay.value) 2.dp else 0.dp,
                            color = Color(0xFF9C27B0),
                            shape = CircleShape
                        )
                ) {
                    Text(
                        text = day.toString(),
                        color = if (day == selectedDay.value) Color.Black else Color.White,
                        fontSize = 14.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(
            onClick = { /* 여기에 클릭 이벤트 추가 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = MaterialTheme.shapes.medium,
            border = BorderStroke(1.dp, Color(0xFF9C27B0)),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF9C27B0))
        ) {
            Text(
                text = "+",
                color = Color(0xFF9C27B0),
                fontSize = 20.sp
            )
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0x33111111)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .width(345.dp)
                .height(232.dp)
                .background(color = Color.White, shape = RoundedCornerShape(20.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column (
                modifier = Modifier
                    .border(width = 1.dp, color = Color(0xFFA6A6A6), shape = RoundedCornerShape(size = 8.dp))
                    .width(307.dp)
                    .height(55.dp)
            ){
                Text(
                    text = "무슨 메모를 작성하실건가요?",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(
                    onClick = { /* 뒤로가기 클릭 이벤트 */ },
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color(0xFF9C27B0)),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF9C27B0))
                ) {
                    Text("뒤로", color = Color(0xFF9C27B0))
                }

                Button(
                    onClick = { /* 확인 클릭 이벤트 */ },
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF902BE9)),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text("확인", color = Color.White)
                }
            }
        }
    }
}
@Preview
@Composable
fun PreviewSelection_Calendar1() {
    Selection_Calendar1()
}
