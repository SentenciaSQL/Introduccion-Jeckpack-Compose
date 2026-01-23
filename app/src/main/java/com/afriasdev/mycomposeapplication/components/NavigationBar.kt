package com.afriasdev.mycomposeapplication.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.afriasdev.mycomposeapplication.components.model.NavItem


@Composable
fun MyNavigationBar(modifier: Modifier = Modifier) {

    val itemList =
        listOf(
            NavItem("Home", Icons.Default.Home),
            NavItem("Fav", Icons.Default.Favorite),
            NavItem("Profile", Icons.Default.Person)
        )

    var selectedIndex by remember { mutableIntStateOf(0) }

    NavigationBar(containerColor = Color.Blue, tonalElevation = 1.dp) {
        itemList.forEachIndexed { index, item ->
            MyFriasDev(navItem = item, isSelected = index == selectedIndex) {
                selectedIndex = index
            }
        }

    }
}

@Composable
fun RowScope.MyFriasDev(navItem: NavItem, isSelected: Boolean, onItemClick: () -> Unit) {
    val colors = NavigationBarItemDefaults.colors(
        selectedIconColor = Color.Red,
        selectedTextColor = Color.White,
        indicatorColor = Color.White,
        unselectedIconColor = Color.White,
        unselectedTextColor = Color.White,
        disabledTextColor = Color.Gray,
        disabledIconColor = Color.Gray
    )

    NavigationBarItem(
        selected = isSelected,
        onClick = {  onItemClick() },
        icon = { Icon(navItem.icon, contentDescription = null) },
        label = { Text(navItem.name) },
        colors = colors
    )
}