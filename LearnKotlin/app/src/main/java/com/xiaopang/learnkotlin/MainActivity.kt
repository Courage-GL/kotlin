package com.xiaopang.learnkotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.xiaopang.learnkotlin.ui.theme.LearnKotlinTheme

const val myAag = 100
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // var 修饰 可读可改
//        var name: String = "小胖"
//        name = "小小胖"
//        Log.e("aaa", name)
        // todo ==== 内置数据类型
        /*
         * 基本数据类型：
         * 1. Boolean
         * 2. Byte
         * 3. Char
         * 4. Short
         * 5. Int
         * 6. Long
         * 7. Float
         * 8. Double
         * 9. String
         * 10. Array<T>
         * 11. List<T>
         * 12. Set<T>
         * 13. Map<K, V>
         *
         * 引用数据类型：
         * 1. Any
         * 2. Nothing
         * 3. Unit
         * 4. Nothing?
         * 5. Any?
         * 6. Unit?
         * 7. Any?
         * 8. Nothing?
         * 9. Any?
         * 10. Unit?
         * 11. Nothing?
         * 12. Any?
         */
        // val修饰的变量只读
//        val myName: String = "小胖"
////        myName = "小胖1"
//        Log.e("aaa", myName)

        // kotlin 语言类型判断 (Explicitly given type is redundant here )
//        val age: Int = 99
//        val age = 99
//        Log.e("aaa", "年龄" + age)

        // 编译时常量 Modifier 'const' is not applicable to 'local variable'
//        const val myAag = 100
        Log.e("aaa", "年龄" + myAag)
    }
}