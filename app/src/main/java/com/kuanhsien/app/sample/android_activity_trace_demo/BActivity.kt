package com.kuanhsien.app.sample.android_activity_trace_demo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_demo.*

class BActivity : BaseActivity() {

    private val tag = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        tv_demo_switch_activity.text = getString(R.string.tv_title_current_page, "B")

        // Goto C
        btn_start_previous_page.text = getString(R.string.button_goto_C)
        btn_start_previous_page.setOnClickListener {
            Log.d(TAG_ACTIVITY_LOG,  "[$tag] Start C activity.")
//            startActivity(Intent(this, CActivity::class.java))
            startActivityForResult(Intent(this, CActivity::class.java), 1)
        }

        // Goto F
        btn_start_next_page.text = getString(R.string.button_goto_F)
        btn_start_next_page.setOnClickListener {
            Log.d(TAG_ACTIVITY_LOG,  "[$tag] Start F activity.")
            startActivity(Intent(this, FActivity::class.java))
        }

        // Start Specific Page
        btn_start_specific_page.isVisible = false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}