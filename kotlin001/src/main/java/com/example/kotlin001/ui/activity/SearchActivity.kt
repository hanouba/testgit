package com.example.kotlin001.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin001.R
import com.example.kotlin001.base.BaseActivity
import pub.devrel.easypermissions.EasyPermissions
import java.util.jar.Manifest

class SearchActivity : BaseActivity() {
    override fun startLoad() {

    }

    override fun initView() {
        checkpermission()
    }

    private fun checkpermission() {
        val prem = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE)
        EasyPermissions.requestPermissions(this,"应用需要下列权限",1)
    }

    override fun initData() {
    }

    override fun getLayoutId(): Int {
       return R.layout.activity_splash
    }


}
