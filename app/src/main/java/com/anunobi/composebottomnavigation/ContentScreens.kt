package com.anunobi.composebottomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.design_default_color_primary))
        .wrapContentSize(Alignment.Center)
    ){
        Text(
            text = "Home View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

@Composable
fun MusicScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.design_default_color_primary))
        .wrapContentSize(Alignment.Center)
    ){
        Text(
            text = "Music View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun MusicScreenPreview(){
    MusicScreen()
}

@Composable
fun MovieScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.design_default_color_primary))
        .wrapContentSize(Alignment.Center)
    ){
        Text(
            text = "Movie View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun MovieScreenPreview(){
    MovieScreen()
}

@Composable
fun BookScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.design_default_color_primary))
        .wrapContentSize(Alignment.Center)
    ){
        Text(
            text = "Book View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BookScreenPreview(){
    BookScreen()
}


@Composable
fun ProfileScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.design_default_color_primary))
        .wrapContentSize(Alignment.Center)
    ){
        Text(
            text = "Profile View",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()
}