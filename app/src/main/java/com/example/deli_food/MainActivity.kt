package com.example.deli_food

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.deli_food.components.BottomNav
import com.example.deli_food.components.CardSection
import com.example.deli_food.components.FeaturedSection
import com.example.deli_food.components.LocationSection
import com.example.deli_food.components.MenuSection
import com.example.deli_food.ui.theme.DeliFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeliFoodTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DeliAppPortrait()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(padding: Modifier) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),

                ) {
            LocationSection()
            Spacer(modifier = Modifier.height(10.dp))
            CardSection()
            Spacer(modifier = Modifier.height(10.dp))
            MenuSection()
            //Spacer(modifier = Modifier.height(10.dp))
            FeaturedSection()


        }

    }
@Preview
@Composable
fun DeliAppPortrait(){
    Scaffold(
        bottomBar = {
            BottomNav()
        }
    ){
        paddingValues ->
        HomeScreen(Modifier.padding(paddingValues))
    }
}


