package com.xiaopang.jbf_im.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 09:00
 * @Description : SplashActivity
 * @Email : gl1450030827@163.com
 */
abstract class BaseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(getLayoutID(), container, false)
        initView(view)
        initData()
        return view
    }

    abstract fun getLayoutID(): Int
    abstract fun initView(view: View)
    abstract fun initData()
}