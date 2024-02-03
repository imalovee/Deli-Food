package com.example.deli_food.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deli_food.R


val menuList = listOf(
    R.drawable.offers_removebg_preview to R.string.offers,
R.drawable.chicken_removebg_preview to R.string.fries,
    R.drawable.pizza_removebg_preview to R.string.pizza,
    R.drawable.parfait_removebg_preview to R.string.parfait,
    R.drawable.salad_removebg_preview to R.string.salad,
    R.drawable.rice_removebg_preview to R.string.rice,

    R.drawable.coffe_removebg_preview to R.string.coffee,
    R.drawable.burger_removebg_preview to R.string.burger
    ).map{DrawableStringPair(it.first, it.second)}


@Preview
@Composable
fun MenuSection(modifier: Modifier = Modifier){
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(4),
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp
        ){
            items(menuList){ item ->
                MenuItem(item.drawable, item.text)
            }
    }
}

@Composable
fun MenuItem(@DrawableRes drawable: Int,
             @StringRes text: Int,) {

    Box(
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.inverseOnSurface,
                shape = RoundedCornerShape(25.dp)
            )
            .padding(6.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(6.dp)
                        .size(80.dp)
                        .clickable { }
                        .background(MaterialTheme.colorScheme.inverseOnSurface)
            ) {
            Box (
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                   .size(40.dp),
                contentAlignment = Alignment.CenterEnd

            ){
                Image(painter = painterResource(drawable)  ,
                    contentDescription = null,

                    )
            }
            //Spacer(modifier = Modifier.height(5.dp))

            Text(text = stringResource(text) ,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontSize = 10.sp
                )

        }
    }
}