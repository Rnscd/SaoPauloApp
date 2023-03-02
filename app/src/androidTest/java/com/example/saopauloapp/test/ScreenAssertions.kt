package com.example.saopauloapp.test
import androidx.navigation.NavController
import com.example.saopauloapp.ui.Dest
import junit.framework.Assert.assertEquals
import org.junit.Assert

fun NavController.assertScreen(screenName: String){
    assertEquals(screenName, currentBackStackEntry?.destination?.route)
}