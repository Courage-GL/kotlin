package com.xiaopang.jbf_im.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 14:16
 * @Description : MyFragmentPagerAdapter
 * @Email : gl1450030827@163.com
 */
class MyFragmentPagerAdapter(var fragments: List<Fragment>, fm : FragmentManager) : FragmentPagerAdapter(fm) {

    companion object {
        const val TAG= "MyFragmentPagerAdapter"
    }

    override fun getCount(): Int = fragments.size

    override fun getItem(position: Int) = fragments.get(position)
}
