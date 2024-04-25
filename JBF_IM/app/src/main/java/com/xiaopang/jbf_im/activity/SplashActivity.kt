package com.xiaopang.jbf_im.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import com.xiaopang.jbf_im.R
import com.xiaopang.jbf_im.base.BaseActivity
import com.xiaopang.jbf_im.utils.ToastHelper
import java.util.Timer
import kotlin.concurrent.timerTask

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 09:00
 * @Description : SplashActivity
 * @Email : gl1450030827@163.com
 */
@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity(), View.OnClickListener {
    private var skipRl: RelativeLayout? = null
    private var seeDetailsRl: RelativeLayout? = null
    private var timer: Timer? = null
    private var time: TextView? = null
    private var recLen = 3
    override fun getLayoutID(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
        skipRl = findViewById(R.id.skip_view_rl)
        seeDetailsRl = findViewById(R.id.see_details_rl)
        skipRl?.setOnClickListener(this)
        seeDetailsRl?.setOnClickListener(this)
        time = findViewById(R.id.advertise_time)
    }

    override fun initData() {
        timer = Timer()
        timer!!.schedule(timerTask {
            runOnUiThread {
                time?.text = recLen.toString()
                recLen--
                if (recLen == 0) {
                    timer!!.cancel()
                    timer = null
                    jumpToMainActivity()
                }
            }
        }, 0, 1000)

    }

    override fun onClick(v: View?) {
        when (v) {
            skipRl -> {
                jumpToMainActivity()
            }

            seeDetailsRl -> {
                ToastHelper.makeText(this, "查看详情")
            }
        }
    }

    private fun jumpToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}