package edu.uksw.fti.pam.pamactivityintent.ui

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import edu.uksw.fti.pam.pamactivityintent.R

sealed class BottomNavItems(
    val title: Int,
    val icon: Int,
    val screen_route: String
) {
    object Home: BottomNavItems(R.string.home, R.drawable.ic_home_24, "home")
    object Users: BottomNavItems(R.string.commuity, R.drawable.ic_users_1, "community")
    object Bookmark: BottomNavItems(R.string.bookmark, R.drawable.ic_bookmark2,"bookmark")
    object Titles: BottomNavItems(R.string.titles, R.drawable.ic_book_open2, "titles")
    object Profile: BottomNavItems(R.string.profile, R.drawable.ic_profile_kucing_35, "profile")
}