package com.chejdj.wanandroid_kotlin.ui.project

import com.chejdj.wanandroid_kotlin.R
import com.chejdj.wanandroid_kotlin.ui.base.BaseTagFragment
import com.chejdj.wanandroid_kotlin.ui.project.presenter.ProjectPresenter

class ProjectFragment : BaseTagFragment() {
    override fun initView() {
        type = 1
        title.setText(R.string.menu_project)
        val presenter = ProjectPresenter(this)
        presenter.getProjectTags()
    }
}