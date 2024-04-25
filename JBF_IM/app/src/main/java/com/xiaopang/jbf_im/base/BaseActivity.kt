package com.xiaopang.jbf_im.base

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xiaopang.jbf_im.R
import com.xiaopang.jbf_im.view.LoadingDialog

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 09:00
 * @Description : SplashActivity
 * @Email : gl1450030827@163.com
 */

abstract class BaseActivity : AppCompatActivity() {
    lateinit var mProgressDialog: LoadingDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())
        initView()
        initData()
    }

    abstract fun getLayoutID(): Int
    abstract fun initView()
    abstract fun initData()

    fun showLoadingDialog(message: String?) {
        dismissDialog()
        mProgressDialog = LoadingDialog.Builder(this).setMessage(message).create();
        if (mProgressDialog.isShowing() != true) {
            mProgressDialog.show()
        }
    }

    //    隐藏加载框
    fun dismissDialog() {
        if (mProgressDialog.isShowing() == true) {
            mProgressDialog.dismiss()
        }
    }
}