package com.xiaopang.jbf_im.activity

import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.viewpager.widget.ViewPager
import com.xiaopang.jbf_im.R
import com.xiaopang.jbf_im.adapter.MyFragmentPagerAdapter
import com.xiaopang.jbf_im.base.BaseActivity
import com.xiaopang.jbf_im.fragment.ContactsFragment
import com.xiaopang.jbf_im.fragment.MessageFragment
import com.xiaopang.jbf_im.fragment.MineFragment
import com.xiaopang.jbf_im.fragment.WorkFragment

class MainActivity : BaseActivity(), RadioGroup.OnCheckedChangeListener,ViewPager.OnPageChangeListener {
    private lateinit var  viewPager: ViewPager
    private lateinit var radioGroup: RadioGroup
    private lateinit var messageRb: RadioButton
    private lateinit var contactsRb: RadioButton
    private lateinit var workRb: RadioButton
    private lateinit var mineRb: RadioButton
    private lateinit var fragments:ArrayList<Fragment>



    private lateinit var messageFragment: MessageFragment
    private lateinit var contactsFragment: ContactsFragment
    private lateinit var mineFragment: MineFragment
    private lateinit var workFragment: WorkFragment
    override fun getLayoutID(): Int {
        return R.layout.activity_main
    }


    override fun initView() {
        viewPager = findViewById(R.id.view_pager)
        radioGroup = findViewById(R.id.radio_group)
        messageRb = findViewById(R.id.message_rb)
        contactsRb = findViewById(R.id.contacts_rb)
        workRb = findViewById(R.id.work_rb)
        mineRb = findViewById(R.id.mine_rb)
        initListener()
    }

   private fun initListener() {
       radioGroup.setOnCheckedChangeListener(this)
       viewPager.addOnPageChangeListener(this)
    }
    override fun initData() {
        fragments = ArrayList<Fragment>()
        initFragments()
        viewPager.adapter = MyFragmentPagerAdapter(fragments,supportFragmentManager)
        viewPager.offscreenPageLimit = fragments.size
        viewPager.currentItem = 2
    }

    private fun initFragments() {
        fragments.clear()
        messageFragment = MessageFragment()
        contactsFragment = ContactsFragment()
        workFragment = WorkFragment()
        mineFragment = MineFragment()
        fragments.add(messageFragment)
        fragments.add(contactsFragment)
        fragments.add(workFragment)
        fragments.add(mineFragment)
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when (checkedId) {
            R.id.message_rb -> {
                viewPager.currentItem = 0
            }
            R.id.contacts_rb -> {
                viewPager.currentItem = 1
            }
            R.id.work_rb -> {
                viewPager.currentItem = 2
            }
            R.id.mine_rb -> {
                viewPager.currentItem = 3
            }
        }
    }

    override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

    }

    override fun onPageSelected(p0: Int) {
        when (p0) {
            0 -> {
                messageRb.isChecked = true
            }
            1 -> {
                contactsRb.isChecked = true
            }
            2 -> {
                workRb.isChecked = true
            }
            3 -> {
                mineRb.isChecked = true
            }
        }
    }

    override fun onPageScrollStateChanged(p0: Int) {
    }

}