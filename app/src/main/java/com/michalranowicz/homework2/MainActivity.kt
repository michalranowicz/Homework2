package com.michalranowicz.homework2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.michalranowicz.homework2.ui.theme.Homework2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homework2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(top = 50.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Flatten")
                }
                Surface(
                    modifier = Modifier
                        .width(900.dp)
                        .padding(start = 200.dp, top = 50.dp, end = 0.dp, bottom = 0.dp),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Flatten()
                }
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(top = 150.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Duplicate")
                }
                Surface(
                    modifier = Modifier
                        .width(900.dp)
                        .padding(start = 200.dp, top = 150.dp, end = 0.dp, bottom = 0.dp),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Duplicate(text = "qqq", index = 3)
                }
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(top = 250.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Palindrom")
                }
                Surface(
                    modifier = Modifier
                        .width(900.dp)
                        .padding(start = 200.dp, top = 250.dp, end = 0.dp, bottom = 0.dp),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Palidrom("all")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Function $name!")
}

@Composable
fun Flatten() {
    val lists = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))
    val flattenList = lists.flatten()
    println(flattenList)
    Text(text = flattenList.toString())
}
@Composable
fun Duplicate( text:String, index:Int){
    var text =text
    var index = index
    var newText= text.repeat(index).toList()
    println(newText)
    Text(text = newText.toString())
}
@Composable
fun Palidrom (text: String){
    val list = text.toList()
    Column() {
        if (list == list.reversed()){
            Text(text = "Lista składajaca się z : $list to palindrom")
        }
        else {
        Text(text ="Lista składajaca się z : $list nie jest  palindromem" )
    }
    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Homework2Theme {
        Greeting("Android")
    }
}