package com.app.tiktok.ui.discover.fragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.app.tiktok.R
import com.app.tiktok.base.BaseFragment
import com.app.tiktok.ui.discover.viewmodel.DiscoverViewModel

class DiscoverFragment : BaseFragment(R.layout.fragment_discover) {
    private lateinit var viewModel: DiscoverViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(DiscoverViewModel::class.java)
    }
}