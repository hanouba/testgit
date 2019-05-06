package com.example.kotlin001.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.*
import com.blankj.utilcode.util.DeviceUtils.getAndroidID
import com.example.kotlin001.R
import com.example.kotlin001.base.BaseActivity
import com.example.kotlin001.mvp.contract.LoginContract
import com.example.kotlin001.mvp.presenter.LoginPresenter
import com.example.kotlin001.ui.MainActivity
import com.example.kotlin001.utils.NetworkUtil
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() ,LoginContract.View{
    override fun toMainActivity() {
        startActivity(Intent(this,MainActivity::class.java))
    }

    private val mLoginPresenter by lazy {LoginPresenter()}


    override fun showLoading() {
        ToastUtils.showShort("显示loading")
    }

    override fun dismissLoading() {
    ToastUtils.showShort("停止显示loading")
    }


    override fun startLoad() {

    }

    override fun initView() {
        mLoginPresenter.attachView(this)
        bt_login.setOnClickListener {
            mLoginPresenter.login(et_name.text.toString(),et_pwd.text.toString(),DeviceUtils.getAndroidID())
        }
    }

    override fun initData() {
        var macAddress = DeviceUtils.getMacAddress()
        var userName = et_name.text.toString()
        var userPwd = et_pwd.text.toString()
        var serverIp = et_server_ip.text.toString()
        var serverPort = et_port.text.toString()

    }

    override fun getLayoutId(): Int {
       return R.layout.activity_login
    }


}
