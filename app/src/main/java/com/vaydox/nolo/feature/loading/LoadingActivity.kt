package com.vaydox.nolo.feature.loading

import com.vaydox.nolo.core.platform.BaseActivity
import com.vaydox.nolo.core.platform.BaseFragment

class LoadingActivity : BaseActivity() {

    override fun fragment(): BaseFragment = LoadingFragment()

}
