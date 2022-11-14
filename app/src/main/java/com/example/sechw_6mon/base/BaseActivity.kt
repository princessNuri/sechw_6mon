package com.example.sechw_6mon.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<Binding : ViewBinding>(@LayoutRes layoutId: Int) :
    Fragment(
        layoutId
    ) {
    protected abstract val binding: Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
        initViews()
        initListeners()
        sendRequest()
        initObservers()
    }

    protected open fun initialize() {
    }

    protected open fun initViews() {
    }

    protected open fun initListeners() {
    }

    protected open fun sendRequest() {
    }

    protected open fun initObservers() {
    }
}