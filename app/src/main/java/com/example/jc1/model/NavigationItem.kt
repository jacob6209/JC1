package com.example.jc1.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var rout:String,var title:String ,var img:ImageVector){
    object Home:NavigationItem("home","Home",Icons.Default.Home)
    object Favorites:NavigationItem("favorite","Favorites",Icons.Default.Favorite)
    object Tickets:NavigationItem("tickets","Tickets",Icons.Default.List)
    object Profile:NavigationItem("profile","Profile",Icons.Default.Person)

}
