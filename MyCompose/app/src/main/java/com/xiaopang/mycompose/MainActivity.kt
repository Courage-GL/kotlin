package com.xiaopang.mycompose

import android.os.Bundle
import android.service.quicksettings.Tile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.xiaopang.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {

            }
        }
    }
}

@Composable
private fun TabItem(@DrawableRes iconId: Int, title: String) {
    Column() {
        Icon(painter = painterResource(id = iconId), contentDescription = title)
        Text(title)
    }

}

@Preview(showBackground = true)
@Composable
fun TabItemPreView() {
    MyComposeTheme {
        TabItem(iconId = R.drawable.ic_launcher_foreground, title = "聊天")
    }
}