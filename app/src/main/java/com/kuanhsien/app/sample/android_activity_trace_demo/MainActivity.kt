package com.kuanhsien.app.sample.android_activity_trace_demo

import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : LoggerActivity() {

    private val tag = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // [Demo 1] Activity lifecycle when a customized dialog is shown.
        btn_show_custom_dialog.setOnClickListener {
            showCustomDialog()
        }

        // [Demo 2] Activity lifecycle when a system dialog is shown.
        btn_show_system_dialog.setOnClickListener {
            showRequestPermissionDialog()
        }

        // [Demo 3] Switch Activities
        btn_switch_activity.setOnClickListener {
            startActivity(Intent(this, BActivity::class.java))
        }
    }

    /**
     *  Show dialog to explain the permission rationale
     */
    private fun showCustomDialog() {

        Log.d(TAG_ACTIVITY_LOG,  "[$tag][Demo 1] Activity lifecycle when a customized dialog is shown.")
        AlertDialog.Builder(this)
            .setMessage("[Demo 1] Activity lifecycle when a customized dialog is shown.")
            .setPositiveButton("OK") { _, _ -> } // just dismiss dialog
            .show()
    }

    /**
     *  Show dialog to explain the permission rationale
     */
    private fun showRequestPermissionDialog() {

        Log.d(TAG_ACTIVITY_LOG, "[$tag][Demo 2] Activity lifecycle when a system dialog is shown.")
        ActivityCompat.requestPermissions(
            this,
            arrayOf(ACCESS_FINE_LOCATION),
            REQUEST_PERMISSIONS_ACCESS_FINE_LOCATION
        )
    }

    companion object {
        private const val REQUEST_PERMISSIONS_ACCESS_FINE_LOCATION = 1
    }
}
