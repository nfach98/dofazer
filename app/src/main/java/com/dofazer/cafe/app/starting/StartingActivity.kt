package com.dofazer.cafe.app.starting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import com.dofazer.cafe.R
import com.dofazer.cafe.app.starting.fragment.LoginFragment
import com.dofazer.cafe.app.starting.fragment.RegisterFragment
import kotlinx.android.synthetic.main.activity_starting.*

class StartingActivity : AppCompatActivity() {

    companion object {
        var state = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starting)

        Handler().postDelayed({
            fragContainer.visibility = View.VISIBLE
            when(state){
                0 -> replaceFragment(LoginFragment.newInstance())
                1 -> replaceFragment(RegisterFragment.newInstance())
            }
        }, 2000)
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragContainer, fragment, fragment::class.java.simpleName)
            .commit()
    }
}
