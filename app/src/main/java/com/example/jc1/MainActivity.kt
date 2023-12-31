package com.example.jc1

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jc1.model.Travel
import com.example.jc1.ui.screens.DataGrid
import com.example.jc1.ui.screens.HeaderFilter
import com.example.jc1.ui.theme.JC1Theme
import com.example.jc1.ui.screens.HeaderGreating
import com.example.jc1.ui.screens.HeaderSearchLine
import com.example.jc1.ui.screens.NavBar
import com.example.jc1.ui.theme.AppDarkGray
import com.example.jc1.ui.theme.AppLightGray
import com.example.jc1.ui.theme.AppRed
import com.example.jc1.ui.theme.AppWhite
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun MainView() {
    val travel= listOf(
        Travel("Paris",220,R.drawable.paris),
        Travel("Bali",150,R.drawable.bali),
        Travel("Bankok",170,R.drawable.bankok),
        Travel("Rome",200,R.drawable.rome),
        Travel("Hawaii",190,R.drawable.dubai),
        Travel("Tehran",120,R.drawable.tehran),
        Travel("Bali",150,R.drawable.bali),


    )
    Scaffold(
        bottomBar = {NavBar()}
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                HeaderGreating()
                Spacer(modifier = Modifier.height(10.dp))
                HeaderSearchLine()
                Spacer(modifier = Modifier.height(10.dp))
                HeaderFilter()
                DataGrid(travel)

            }
        }
    }
}




@Preview(backgroundColor = 0xffeb6d67, showBackground = true)
@Composable
fun GreetingPreview() {
    JC1Theme {
        MainView()
    }
}