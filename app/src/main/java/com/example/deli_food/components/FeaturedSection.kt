package com.example.deli_food.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deli_food.R
@Preview
@Composable
fun FeaturedSection(){
    Column(

    ) {
        Text(text = "Featured",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
            )
        //Spacer(modifier = Modifier.height(5.dp))
        Row(modifier = Modifier
            .fillMaxWidth()) {
            Box(modifier = Modifier
                .padding(8.dp)
                .background(shape = RoundedCornerShape(25.dp),
                    color = MaterialTheme.colorScheme.onSecondaryContainer )
            ) {
                Column(verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(6.dp)
                        .background(MaterialTheme.colorScheme.onSecondaryContainer)
                        .clickable {  }
                ) {
                    Image(painter = painterResource(R.drawable.burger_removebg_preview ),
                        contentDescription = null,
                        alignment = Alignment.TopCenter
                        )
                    Text(text = "McDonald-Jumbo",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White
                        )

                    Text(text = "1.2Km; 15-20 minutes",
                        fontSize = 20.sp,
                        color = Color.Green
                    )
                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box(modifier = Modifier
               // .padding(8.dp)
               .background(shape = RoundedCornerShape(25.dp),
                   color = MaterialTheme.colorScheme.onSecondaryContainer )) {
                Column(verticalArrangement = Arrangement.SpaceBetween,
                   horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(6.dp)
                        .background(MaterialTheme.colorScheme.onSecondaryContainer)
                        .clickable {  }
               ) {
                    Image(painter = painterResource(R.drawable.burger_removebg_preview ),
                       contentDescription = null,
                       alignment = Alignment.TopCenter
                    )
                   Text(text = "Salad-Special",
                       fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                   )

                   Text(text = "1.2Km; 15-20 minutes",
                       fontSize = 20.sp,
                   color = Color.Green
                   )
                }
           }
        }
    }
}