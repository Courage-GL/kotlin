package com.xiaopang.jbf_im.fragment

import android.view.View
import com.bumptech.glide.Glide
import com.xiaopang.jbf_im.R
import com.xiaopang.jbf_im.base.BaseFragment
import com.xiaopang.jbf_im.bean.BannerInfo
import com.xiaopang.jbf_im.utils.ToastHelper
import com.zhzc0x.banner.BannerView

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 14:03
 * @Description : HomeFragment
 * @Email : gl1450030827@163.com
 */
class WorkFragment: BaseFragment() {
    private lateinit var bannerInfos:List<BannerInfo>
    private lateinit var bannerView: BannerView
    override fun getLayoutID(): Int {
        return R.layout.fragment_work
    }

    override fun initView(view: View) {
        bannerView = view.findViewById(R.id.banner_view)
        bannerView.setAllowUserScrollable(true)
        bannerInfos = listOf(
            BannerInfo(imgURL = "http://photocq.photo.store.qq.com/psc?/V14Rxniv2U0S9D/cXP39dXjFtymXNK2lOGni7w0LiIWS5IckQE9TG0t1ftC89uRDmF.vB14O6fOc2FZphzCrtsdqH6GAsbLCpfsG5wov8Ozz7TyS45UyAVf6WI!/b&bo=ngL2AZ4C9gEFFzQ!&rf=viewer_4",
                description  = "111"),
            BannerInfo(imgURL = "http://photocq.photo.store.qq.com/psc?/V14Rxniv2U0S9D/cXP39dXjFtymXNK2lOGni83Es8qQnOlse*pbVd1M1HZfzu7HzvPNEeBfuKoXEYcKLv1MAEx0HFHwpgoyGSM8VNqmeINMJcNRtyDKTGIKK*0!/b&bo=LAIgAywCIAMFFzQ!&rf=viewer_4",
                description = "2222"),
            BannerInfo(imgURL = "http://photocq.photo.store.qq.com/psc?/V14Rxniv2U0S9D/cXP39dXjFtymXNK2lOGni0YAeqnprq8Bz*2LVpYQXcbygVY1K8xi7t8fOe6KdEK6V*hj6vlsz2CJbP5obbQKYYelaUfvptiyFC83Y9SAB84!/b&bo=CQI3AQkCNwEFFzQ!&rf=viewer_4",
                description = "333"),
            BannerInfo(imgURL = "http://photocq.photo.store.qq.com/psc?/V14Rxniv2U0S9D/cXP39dXjFtymXNK2lOGni1tyipuKGV5Qo53j5*PS*1xryaKKaT1QibzItxvf4i*fiw8m9aV86cUhG0SGknOczhjV.TQ6DgyUkyXyhIHFEIY!/b&bo=ngLOAZ4CzgEFFzQ!&rf=viewer_4",
                description = "4444")
        )
    }

    override fun initData() {
        bannerView.setData(bannerInfos, bannerInfos.map { it.description }) { itemBinding, data ->
            Glide.with(this).load(data.imgURL).into(itemBinding.root)
            itemBinding.root.setOnClickListener {
                context?.let { it1 -> ToastHelper.makeText(it1, "${data.description}: 被点击了！") }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        bannerView.setAutoplay(true)
    }
    //Activity不可见时停止自动播放
    override fun onPause() {
        super.onPause()
        bannerView.setAutoplay(false)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}