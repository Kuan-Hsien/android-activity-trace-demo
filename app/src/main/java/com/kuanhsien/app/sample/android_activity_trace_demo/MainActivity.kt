package com.kuanhsien.app.sample.android_activity_trace_demo

import android.os.Bundle

class MainActivity : LoggerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
