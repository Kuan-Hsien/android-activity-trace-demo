package com.kuanhsien.app.sample.android_activity_trace_demo

import android.content.Intent
import android.util.Log
import androidx.core.app.NavUtils
import androidx.core.app.TaskStackBuilder

abstract class BaseActivity : LoggerActivity() {

    private val tag = this.javaClass.simpleName

    override fun onBackPressed() {

        // Method 1: directly use onBackPressed
        // super.onBackPressed()

        // Method 2.1: directly use navigateUpTo
        // NavUtils.navigateUpTo(this, NavUtils.getParentActivityIntent(this)!!)

        // Method 2.2: use NavUtils.navigateUpTo + TaskStackBuilder
//        NavUtils.navigateUpTo(this, NavUtils.getParentActivityIntent(this)!!)
//        val upIntent = NavUtils.getParentActivityIntent(this)
//
//        if (NavUtils.shouldUpRecreateTask(this, upIntent!!)) {
//            Log.d(TAG_ACTIVITY_LOG,  "[$tag] NavUtils.shouldUpRecreateTask")
//
//            TaskStackBuilder.create(this)
//                // 添加這個 activity 的所有父 activity 到後退棧中
//                .addNextIntentWithParentStack(upIntent)
//                // 向上導航到最近的一個父 activity
//                .startActivities()
//        } else {
//            Log.d(TAG_ACTIVITY_LOG,  "[$tag] NavUtils.navigateUpTo")
//
//            // 這個 activity 是這個 app 任務的一部分, 所以
//            // 向上導航到 parent activity.
//            NavUtils.navigateUpTo(this, upIntent)
//        }

        // Method 3: start parent activity with intent flag
        NavUtils.getParentActivityIntent(this)?.let { upIntent ->

            upIntent
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            this.startActivity(upIntent)
        }

        finish()
    }

}