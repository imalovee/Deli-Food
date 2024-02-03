package com.example.deli_food.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun LocationSection(){
    Row(modifier = Modifier
        .fillMaxWidth(),
       // .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box (modifier = Modifier
            .background(MaterialTheme.colorScheme.inverseOnSurface,
               // shape = RoundedCornerShape(25.dp)
            )
            .padding(6.dp)
            .clip(shape = CircleShape)
            .clickable { }
        ){
            Icon(imageVector = Icons.Default.Search,
                contentDescription = "search" ,
                tint = MaterialTheme.colorScheme.onSecondaryContainer)
        }

        Column {
            Text(text = "Current Location",
                fontSize = 20.sp,
               )
           // Spacer(modifier = Modifier.height(5.dp))

            Row {
                Icon(imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color.Green)

              // Spacer(modifier = Modifier.weight(5.dp))

                Text(text = "Surakarta, Ind",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
            }
        }
        Box (modifier = Modifier
            .background(MaterialTheme.colorScheme.inverseOnSurface,
                //shape = RoundedCornerShape(25.dp)
            )
            .padding(6.dp)
            .clip(shape = CircleShape)
            .clickable { }
        ){
            Icon(imageVector = Icons.Default.Notifications,
                contentDescription = "search" ,
                tint = MaterialTheme.colorScheme.onSecondaryContainer)
        }
    }
}

