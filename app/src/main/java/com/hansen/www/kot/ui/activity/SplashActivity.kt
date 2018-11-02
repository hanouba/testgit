package com.hansen.www.kot.ui.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import com.bumptech.glide.Glide.init
import com.hansen.www.kot.App
import com.hansen.www.kot.R
import com.hansen.www.kot.base.BaseActivity
import com.hansen.www.kot.utils.AppUtils
import kotlinx.android.synthetic.main.activity_splash.*
import pub.devrel.easypermissions.EasyPermissions

/**
 * 创建者 by ${HanSir} on 2018/11/2.
 * 版权所有  WELLTRANS.
 * 说明      欢迎界面
 */
class SplashActivity : BaseActivity() {
    //字体设置
        //app 名称字体
    private var textTypeface: Typeface? = null
    //描述文字字体
    private var descTypeface: Typeface? = null

    //添加动画
    private var alhaAnimation : AlphaAnimation? = null

    //初始化字体
    init {
        textTypeface = Typeface.createFromAsset(App.context.assets,"fonts/Lobster-1.4.otf")
        descTypeface = Typeface.createFromAsset(App.context.assets,"fonts/FZLanTingHeiS-L-GB-Regular.TTF")
    }
    override fun layoutId(): Int = R.layout.activity_splash
    override fun initData() {
    }
    @SuppressLint("SetTextI18n")
    override fun initView() {
        //控制设置字体
        tv_app_name.typeface = textTypeface
        tv_app_desc.typeface = descTypeface
        //给控件赋值
        tv_version.text = "v${AppUtils.getVerName(App.context)}"

        // 初始化动画
        alhaAnimation = AlphaAnimation(0.3f,1.0f)
        //设置参数
        alhaAnimation?.duration = 2000
        alhaAnimation?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                toMainActivity()
            }

            override fun onAnimationStart(animation: Animation?) {

            }

        })

        checkPermissions()
    }

    private fun checkPermissions() {
        val perms = arrayOf(Manifest.permission.READ_PHONE_STATE,Manifest.permission.WRITE_EXTERNAL_STORAGE)
        EasyPermissions.requestPermissions(this,"应用需要以下权限请允许",0,*perms)
    }

    private fun toMainActivity() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun start() {

    }

    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {
        if (requestCode == 0) {
            if (perms.isNotEmpty()) {
                if (perms.contains(Manifest.permission.READ_PHONE_STATE)
                        && perms.contains(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                    if (alhaAnimation != null) {
                        //启动动画
                        iv_app_icon.startAnimation(alhaAnimation)
                    }
                }
            }
        }
    }


}