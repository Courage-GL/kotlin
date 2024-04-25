package com.xiaopang.jbf_im.utils

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.xiaopang.jbf_im.R

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 10:26
 * @Description : ToastHelper
 * @Email : gl1450030827@163.com
 */
object ToastHelper {
    fun makeText(context:Context,message:String){
        try {
            val toast = Toast(context)
            toast.setDuration(Toast.LENGTH_LONG)
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_custom_layout, null)
            val messageTv = view.findViewById<View>(R.id.msg_tv) as TextView
            messageTv.text = message
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            toast.setView(view)
            toast.show()
        } catch (e: Exception) {
            // do nothing
        }
    }
}