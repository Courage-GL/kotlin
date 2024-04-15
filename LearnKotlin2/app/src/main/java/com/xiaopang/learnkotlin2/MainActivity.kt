package com.xiaopang.learnkotlin2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {
                    Row {
                        TabItem(R.drawable.ic_launcher_foreground,"聊天")
                        TabItem(R.drawable.ic_launcher_foreground,"聊天1")
                        TabItem(R.drawable.ic_launcher_foreground,"聊天2")
                        TabItem(R.drawable.ic_launcher_foreground,"聊天3")
                    }
                }
            }
        }
    }
}

@Composable
private fun TabItem(@DrawableRes iconId: Int, title: String) {
    Column {
        Icon(painterResource(iconId), title)
        Text(title)
    }
}

//@Preview
//@Composable
//fun TableItemPreview() {
//    TabItem(iconId = androidx.core.R.drawable.ic_call_answer, title ="聊天")
//}
@Preview
@Composable
fun TabItemLook() {
//    TabItem(iconId = androidx.core.R.drawable.ic_call_answer, title ="聊天")
    Text("1111")
}