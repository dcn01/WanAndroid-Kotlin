package com.chejdj.wanandroid_kotlin.ui.login.model

import com.chejdj.wanandroid_kotlin.data.DataManager
import com.chejdj.wanandroid_kotlin.data.bean.BaseRes
import com.chejdj.wanandroid_kotlin.data.bean.LoginBean
import com.chejdj.wanandroid_kotlin.ui.login.contract.LoginContract

class LoginModel : LoginContract.Model {
    override suspend fun login(
        accountName: String,
        password: String
    ): BaseRes<LoginBean> {
        return DataManager.login(accountName, password)
    }
}