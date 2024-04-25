package com.xiaopang.jbf_im.view

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.xiaopang.jbf_im.R

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 09:16
 * @Description : LoadingDialog
 * @Email : gl1450030827@163.com
 */
class LoadingDialog(context: Context, themeResId: Int) : Dialog(context, themeResId) {
    class Builder(private val context: Context) {
        private var message: String? = null
        fun setMessage(message: String?): Builder {
            this.message = message
            return this
        }
        fun create(): LoadingDialog {
            val dialog = LoadingDialog(context, R.style.dialog_style)
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val dialogLayoutView = inflater.inflate(R.layout.loading_diaglog,
                null)
            if (!TextUtils.isEmpty(message)) {
                (dialogLayoutView.findViewById<View>(R.id.progress_bar_des) as TextView).text = message
            }

            dialog.setContentView(dialogLayoutView)
            dialog.setCancelable(true)
            dialog.setCanceledOnTouchOutside(false)
            val window = dialog.window
            val context = this.context as Activity
            val windowManager = context.windowManager

            val defaultDisplay = windowManager.defaultDisplay

            val attributes = window!!.attributes
            attributes.width = (defaultDisplay.width * 0.4).toInt()
            window.attributes = attributes
            return dialog
        }
    }


}