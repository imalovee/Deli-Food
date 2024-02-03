package com.example.deli_food.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview
@Composable
fun BottomNav(modifier : Modifier = Modifier){
    NavigationBar(modifier = Modifier
        .fillMaxWidth()
//        .padding(16.dp)
        .background(MaterialTheme.colorScheme.inverseOnSurface)
        .clip(
            RoundedCornerShape(25.dp),

            )
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {  },
            icon = { Icon(
                imageVector = Icons.Rounded.Home ,
                contentDescription =null,
                tint = Color.Black) },
            label = {
                Text(text = "Home")
            },

        )

        NavigationBarItem(
            selected = false,
            onClick = {  },
            icon = { Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription =null,
                tint = Color.Black) },
            label = {
                Text(text = "Email")
            },

            )

        NavigationBarItem(
            selected = false,
            onClick = {  },
            icon = { Icon(
                imageVector = Icons.Rounded.ShoppingCart ,
                contentDescription =null,
                tint = Color.Black) },
            label = {
                Text(text = "Date Range")
            },

            )

        NavigationBarItem(
            selected = false,
            onClick = {  },
            icon = { Icon(
                imageVector = Icons.Rounded.AccountCircle ,
                contentDescription =null,
                tint = Color.Black) },
            label = {
                Text(text = "Profile")
            },

            )
    }

}
