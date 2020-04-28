package com.dofazer.cafe.app.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.dofazer.cafe.R
import com.dofazer.cafe.app.main.fragment.BerandaFragment
import com.dofazer.cafe.app.main.fragment.ProduktifFragment
import com.dofazer.cafe.app.main.fragment.SayaFragment
import com.dofazer.cafe.app.main.fragment.ShiftFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter = MainPagerAdapter(supportFragmentManager).apply {
            addFragment(BerandaFragment.newInstance())
            addFragment(ShiftFragment.newInstance())
            addFragment(ProduktifFragment.newInstance())
            addFragment(SayaFragment.newInstance())
        }

        frame_main.adapter = pagerAdapter
        nav_main.setOnNavigationItemSelectedListener(this)
    }

    private fun swapFragment(position: Int) {
        frame_main.setCurrentItem(position, false)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.menu_home -> {
                swapFragment(0)
                return true
            }
            R.id.menu_shift -> {
                swapFragment(1)
                return true
            }
            R.id.menu_prod -> {
                swapFragment(2)
                return true
            }
            R.id.menu_saya -> {
                swapFragment(3)
                return true
            }
        }
        return false
    }
}
