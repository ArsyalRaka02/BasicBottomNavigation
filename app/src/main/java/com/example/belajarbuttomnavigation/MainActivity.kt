package com.example.belajarbuttomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.belajarbuttomnavigation.FragmentBottomNav.HomeFragment
import com.example.belajarbuttomnavigation.FragmentBottomNav.KategoriFragment
import com.example.belajarbuttomnavigation.FragmentBottomNav.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var homeFragment : HomeFragment
    lateinit var profileFragment : ProfileFragment
    lateinit var kategoriFragment : KategoriFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottom_nav)

        bottomNavigation.setOnNavigationItemSelectedListener {item ->
            when (item.itemId){
                R.id.home -> {
                    homeFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.kategori -> {
                    kategoriFragment = KategoriFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame, kategoriFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.profile -> {
                    profileFragment = ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.profile,profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }

            true

        }

    }
}
