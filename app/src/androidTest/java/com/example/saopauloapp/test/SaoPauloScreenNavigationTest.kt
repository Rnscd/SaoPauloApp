package com.example.saopauloapp.test

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.ui.Dest
import com.example.saopauloapp.ui.SaoPauloApp
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class SaoPauloScreenNavigationTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController

    @Before
    fun setUpSaoPauloNavHost(){
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(
               ComposeNavigator()
            )
            SaoPauloApp(navController = navController)
        }
    }

    @Test
    fun saopauloNavHost_verifyStartDestination(){

        navController.assertScreen(Dest.HOME.name)
    }

    @Test
    fun saopauloNavHost_BackButtonDoesNotExistStart(){

        composeTestRule.onNodeWithContentDescription("voltar").assertDoesNotExist()
    }

    @Test
    fun saopauloNavHost_navigateToBibListScreen(){
        composeTestRule.onNodeWithText("Restaurantes").performClick()

        composeTestRule.onNodeWithContentDescription("voltar").assertExists()

        navController.assertScreen(Dest.LISTRES.name)
    }

    @Test
    fun saopauloNavHost_navigateToBibDetailsScreen() {
        composeTestRule.onNodeWithText("Restaurantes").performClick()
        composeTestRule.onNodeWithText(DataSource.getRestauranteData()[0].nome).performClick()

        composeTestRule.onNodeWithContentDescription("voltar").assertExists()

        navController.assertScreen(Dest.DETAILSRES.name)

        composeTestRule.onNodeWithText(DataSource.getRestauranteData()[0].nome).assertExists()

    }
    @Test
    fun saopauloNavHost_backButtonNavigatesBack(){
        composeTestRule.onNodeWithText("Parques").performClick()
        composeTestRule.onNodeWithText(DataSource.getParqueData()[1].nome).performClick()
        composeTestRule.onNodeWithContentDescription("voltar").performClick()

        navController.assertScreen(Dest.LISTPAR.name)

        composeTestRule.onNodeWithContentDescription("voltar").performClick()

        navController.assertScreen(Dest.HOME.name)
    }

}