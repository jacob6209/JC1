package com.example.jc1.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jc1.model.Travel
import com.example.jc1.ui.theme.AppDarkGray
import com.example.jc1.ui.theme.AppLightGray
import com.example.jc1.ui.theme.AppWhite

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun DataGrid(travel: List<Travel>) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(25.dp, 0.dp, 25.dp, 0.dp)
    ) {
        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(2)) {
            items(travel.size) {
                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                    shape = RoundedCornerShape(15)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = travel[it].img),
                            contentDescription = travel[it].title,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillWidth
                        )
                        Text(
                            text = travel[it].title, color = AppWhite,
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(bottom = 15.dp, start = 15.dp)

                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(bottom = 15.dp, end = 15.dp)
                        ) {

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(AppLightGray)
                                    .padding(5.dp)
                            ) {

                                Text(text = "${travel[it].price}$", color = AppDarkGray)
                            }


                        }
                    }
                }
            }
        }
    }
}