package com.raywenderlich.android.rickycharacters.ui.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.Navigation
import com.raywenderlich.android.rickycharacters.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupNavigation()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    private fun setupNavigation() {
        Navigation.findNavController(this, R.id.navHostFragment)
    }
}
