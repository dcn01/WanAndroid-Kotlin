package com.chejdj.wanandroid_kotlin.ui.login.contract

import com.chejdj.wanandroid_kotlin.data.bean.BaseRes
import com.chejdj.wanandroid_kotlin.data.bean.LoginBean
import io.reactivex.Observable

interface LoginContract {
    interface View {
        fun loginSuccessful(username:String)
        fun loginFail(message:String)
    }

    interface Presenter {
        fun login(accountName: String, password: String)
    }

    interface Model {
        fun login(accountName: String, password: String): Observable<BaseRes<LoginBean>>
    }
}