package com.metatest.littlelemon

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(){ // Start of function HomeScreen

val scaffoldState = rememberScaffoldState()
var scope = rememberCoroutineScope()


Scaffold(
    

    topBar = {

        UpperPanel()

              }




         )

     {

    Column {
        UpperPanel()
        LowerPanel()
            }
     }

}                  // End of function HomeScreen















