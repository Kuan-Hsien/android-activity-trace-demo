package com.kuanhsien.app.sample.android_activity_trace_demo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_demo.*

class EActivity : BaseActivity() {

    private val tag = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        tv_demo_switch_activity.text = getString(R.string.tv_title_current_page, "E")

        // Start Previous Page
        btn_start_previous_page.setOnClickListener {
            Log.d(TAG_ACTIVITY_LOG,  "[$tag] Back to previous activity.")
            onBackPressed()
        }

        // Start Next Page
        btn_start_next_page.isVisible = false

        // Start Specific Page
        btn_start_specific_page.setOnClickListener {
            Log.d(TAG_ACTIVITY_LOG,  "[$tag] Start specific activity.")
            startActivity(Intent(this, CActivity::class.java))
        }
        btn_start_specific_page.text = getString(R.string.button_goto_C)
    }

}