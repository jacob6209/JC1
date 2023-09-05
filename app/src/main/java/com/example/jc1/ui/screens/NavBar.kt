package com.example.jc1.ui.screens

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jc1.model.NavigationItem
import com.example.jc1.ui.theme.AppMenuGray
import com.example.jc1.ui.theme.AppRed
import com.example.jc1.ui.theme.AppWhite
import org.w3c.dom.Text

@Composable
fun NavBar() {
    val menu= listOf(
        NavigationItem.Home,
        NavigationItem.Favorites,
        NavigationItem.Tickets,
        NavigationItem.Profile,
    )
    var selectedMenu:Int by remember {mutableStateOf(0)}
    BottomAppBar( containerColor = AppWhite,contentColor = AppMenuGray,
        modifier = Modifier.clip(RoundedCornerShape(25.dp,25.dp,0.dp,0.dp))){
        menu.forEachIndexed { index, navigationItem ->
            NavigationBarItem(selected = selectedMenu==index, onClick = {selectedMenu=index}, icon = { 
                Icon(imageVector =navigationItem.img , contentDescription =navigationItem.title,
                    modifier = Modifier.size(20.dp)
                )
            },
                label = {Text(text = navigationItem.title)},
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedTextColor= AppRed,
                    selectedIconColor= AppRed,
                    unselectedTextColor = AppMenuGray,
                    unselectedIconColor = AppMenuGray
                )

            )

        }

    }
    
}
@Preview(showBackground = true)
@Composable
fun Preview(){
    NavBar()
}
