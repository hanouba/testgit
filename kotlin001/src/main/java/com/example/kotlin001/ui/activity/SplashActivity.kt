package com.example.kotlin001.ui.activity

import android.Manifest
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.example.kotlin001.R
import com.example.kotlin001.base.BaseActivity
import com.example.kotlin001.ui.MainActivity
import pub.devrel.easypermissions.EasyPermissions
import java.util.logging.Logger

class SplashActivity : BaseActivity() {

    override fun startLoad() {

    }

    override fun initView() {
        checkpermission()
    }

    private fun checkpermission() {
        val prem = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.READ_PHONE_STATE)
        EasyPermissions.requestPermissions(this,"应用需要下列权限",0,*prem)
    }

    override fun initData() {
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {
        LogUtils.d("requestCode",perms+"requestCode"+requestCode)
        if (requestCode == 0) {
            if (perms.isNotEmpty()) {
                if (perms.contains(Manifest.permission.READ_EXTERNAL_STORAGE) && perms.contains(Manifest.permission.READ_PHONE_STATE)) {
                    startActivity(Intent(this,LoginActivity::class.java))
                    finish()
                }
            }
        }
    }
}
