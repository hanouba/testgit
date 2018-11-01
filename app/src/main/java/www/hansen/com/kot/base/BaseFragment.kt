package www.hansen.com.kot.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions
import www.hansen.com.multiview.MultipleStatusView

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
abstract class BaseFragment : Fragment(),EasyPermissions.PermissionCallbacks {
    private var isViewPrepar = false
    private var hasLoadData = false
    protected  var mLayoutStatusView : MultipleStatusView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(),null)
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {
            lazyLoadDataIfPrepared()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isViewPrepar = true
        initView()
        lazyLoadDataIfPrepared()
        //多种状态切换的view 重试点击事件
        mLayoutStatusView?.setOnClickListener(mRetryClickListener)
    }

    abstract fun initView()

    private fun lazyLoadDataIfPrepared() {
        if (userVisibleHint && isViewPrepar && ! hasLoadData) {
            lazyLoad()
            hasLoadData = true
        }
    }

    /**
     * 懒加载
     */
    abstract fun lazyLoad()

    /**
     * 加载布局
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    open val mRetryClickListener : View.OnClickListener = View.OnClickListener {
        lazyLoad()
    }
    /**
     * 重写要申请权限的Activity或者Fragment的onRequestPermissionsResult()方法，
     * 在里面调用EasyPermissions.onRequestPermissionsResult()，实现回调。
     *
     * @param requestCode  权限请求的识别码
     * @param permissions  申请的权限
     * @param grantResults 授权结果
     */
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    /**
     * 当权限申请失败的时候执行的回调
     */
    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {
        Log.i("EasyPermissions", "获取失败的权限$perms")
        //处理权限名字字符串
        val sb = StringBuffer()
        for (str in perms) {
            sb.append(str)
            sb.append("\n")
        }
        sb.replace(sb.length - 2, sb.length, "")
        //用户点击拒绝并不在询问时候调用
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            Toast.makeText(activity, "已拒绝权限" + sb + "并不再询问", Toast.LENGTH_SHORT).show()
            AppSettingsDialog.Builder(this)
                    .setRationale("此功能需要" + sb + "权限，否则无法正常使用，是否打开设置")
                    .setPositiveButton("好")
                    .setNegativeButton("不行")
                    .build()
                    .show()
        }
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {
        Log.i("EasyPermissions", "获取成功的权限$perms")
    }

}