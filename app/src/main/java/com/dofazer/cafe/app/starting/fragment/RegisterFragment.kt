package com.dofazer.cafe.app.starting.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dofazer.cafe.R
import com.dofazer.cafe.app.starting.StartingActivity
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {

    companion object{
        fun newInstance() = RegisterFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login.setOnClickListener {
            StartingActivity.state = 1
        }
    }
}
