package com.hansen.www.kot.ui.activity

import android.Manifest
import android.content.Intent
import com.hansen.www.kot.R
import com.hansen.www.kot.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import pub.devrel.easypermissions.EasyPermissions

/**
 * 创建者 by ${HanSir} on 2018/11/2.
 * 版权所有  WELLTRANS.
 * 说明      欢迎界面
 */
class SplashActivity : BaseActivity() {

    override fun layoutId(): Int = R.layout.activity_splash
    override fun initData() {
    }

    override fun initView() {

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


}