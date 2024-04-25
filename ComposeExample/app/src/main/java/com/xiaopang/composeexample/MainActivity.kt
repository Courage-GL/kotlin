package com.xiaopang.composeexample

import android.os.Bundle
import android.os.Message
import android.service.quicksettings.Tile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xiaopang.composeexample.ui.theme.ComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun MessageCard(message: Msg) {
    Column(Modifier.padding(all = 8.dp)) {
        Text(text = message.title)
        Text(text = message.des)
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(message = Msg(title = "123", des = "111"))
}

data class Msg(val title: String, val des: String)