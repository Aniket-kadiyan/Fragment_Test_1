package com.example.fragmenttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.fragmenttest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? =null
            val binding
            get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.apply {
            val navcontroller by lazy { findNavController(R.id.ListFragmentView) }
            val appbarconfiguration by lazy {
                AppBarConfiguration(
                    setOf(
                        R.id.ListFragmentView,
                        R.id.gridFragment
                    ), drawerLayout = null
                )
            }
            ListFragmentButton.isEnabled=false
            GridFragmentButton.setOnClickListener {

                enableView(GridFragmentButton, false)
                enableView(ListFragmentButton, true)
                if(navcontroller.currentDestination?.id==R.id.listFragment)
                    navcontroller.navigate(R.id.action_listFragment_to_gridFragment)
            }

            ListFragmentButton.setOnClickListener{
                enableView(GridFragmentButton, true)
                enableView(ListFragmentButton, false)
                if(navcontroller.currentDestination?.id==R.id.gridFragment)
                    navcontroller.navigate(R.id.action_gridFragment_to_listFragment)
            }
        }
    }

    private fun enableView(view: View, enabled: Boolean) {
        view.apply {
            isClickable = enabled
            isEnabled = enabled
        }
    }

}