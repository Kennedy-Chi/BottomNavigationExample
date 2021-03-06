package com.anunobi.composebottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.anunobi.composebottomnavigation.ui.theme.ComposeBottomNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBottomNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar(navController)}
    ) {
        Navigation(navController)
    }
}
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

@Composable
fun TopBar(){
    TopAppBar(
        title = {
            Text(text = stringResource(R.string.app_name), fontSize = 18.sp)},
            backgroundColor = colorResource(R.color.design_default_color_primary),
            contentColor = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}

@Composable
fun BottomNavigationBar(navController: NavController){
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Music,
        NavigationItem.Movies,
        NavigationItem.Books,
        NavigationItem.Profile
    )
    BottomNavigation(
        backgroundColor = colorResource(R.color.design_default_color_primary),
        contentColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination
        items.forEach{ item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(item.icon), contentDescription = item.title)},
                label = { Text(text =item.title)},
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute?.hierarchy?.any { it.route == item.route } == true,
                selectedContentColor = Color.White,
                onClick = {
                    navController.navigate(item.route){
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route){
                                saveState = true
                            }
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                }
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun BottomNavigationPreview(){
//    BottomNavigationBar(navController)
//}

@Composable
fun Navigation(navController: NavController){
    NavHost(navController = navController as NavHostController, startDestination = NavigationItem.Home.route){
        composable(NavigationItem.Home.route){
            HomeScreen()
        }
        composable(NavigationItem.Music.route){
            MusicScreen()
        }
        composable(NavigationItem.Movies.route){
            MovieScreen()
        }
        composable(NavigationItem.Books.route){
            BookScreen()
        }
        composable(NavigationItem.Profile.route){
            ProfileScreen()
        }
    }
}