package com.xiaopang.jbf_im.bean

import java.net.URL

/**
 * @Author : 高小胖。
 * @CreateTime :  2024/4/25 15:22
 * @Description : BannerInfo
 * @Email : gl1450030827@163.com
 */
class BannerInfo(imgURL: String, description: String) {
    var imgURL: String = imgURL
    var description: String = description
    override fun toString(): String {
        return "BannerInfo(imgURL='$imgURL', description='$description')"
    }

}