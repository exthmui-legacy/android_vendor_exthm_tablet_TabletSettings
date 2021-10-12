package org.exthmui.tablet.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.exthmui.tablet.settings.R

class BoringdroidSettings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_main)
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings_container, BoringdroidSettingsFragment())
                .commit()

        // Enable back button for preference activity
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
