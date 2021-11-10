package com.anunobi.composebottomnavigation

sealed class NavigationItem(var route: String, var icon: Int, var title: String){
    object Home: NavigationItem("home", R.drawable.ic_baseline_home_24, "Home")
    object Music: NavigationItem("music", R.drawable.ic_baseline_library_music_24, "Music")
    object Movies: NavigationItem("movies", R.drawable.ic_baseline_local_movies_24, "Movies")
    object Books: NavigationItem("books", R.drawable.ic_baseline_library_books_24, "Books")
    object Profile: NavigationItem("profile", R.drawable.ic_baseline_person_24, "Profile")

}
