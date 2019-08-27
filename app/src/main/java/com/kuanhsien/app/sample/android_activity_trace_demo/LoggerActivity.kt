package com.kuanhsien.app.sample.android_activity_trace_demo

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


const val TAG_ACTIVITY_LOG = "[ActivityLog]"

abstract class LoggerActivity : AppCompatActivity() {

    private val tag = this.javaClass.simpleName

    /**
     * Log
     */
    fun logger(log: String) {
        Log.d(TAG_ACTIVITY_LOG,  "[$tag] taskID = $taskId, activity = $this, log = $log")
    }

    // lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        logger("onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        logger("onStart")
        super.onStart()
    }

    override fun onResume() {
        logger("onResume")
        super.onResume()
    }

    override fun onPause() {
        logger("onPause")
        super.onPause()
    }

    override fun onStop() {
        logger("onStop")
        super.onStop()
    }

    override fun onDestroy() {
        logger("onDestroy")
        super.onDestroy()
    }



    override fun onRestart() {
        logger("onRestart")
        super.onRestart()
    }



    override fun onBackPressed() {
        logger("onBackPressed")
        super.onBackPressed()
    }




    override fun onNewIntent(intent: Intent?) {
        logger("onNewIntent")
        super.onNewIntent(intent)
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        logger("onConfigurationChanged(newConfig: Configuration)")
        super.onConfigurationChanged(newConfig)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        logger("onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)")
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>,
                                            grantResults: IntArray) {
        logger("onRequestPermissionsResult(requestCode, permissions, grantResults)")
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }



    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        logger("onConfigurationChanged(outState: Bundle?, outPersistentState: PersistableBundle?)")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        logger("onConfigurationChanged(outState: Bundle)")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        logger("onConfigurationChanged(savedInstanceState: Bundle?)")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        logger("onConfigurationChanged(savedInstanceState: Bundle?, persistentState: PersistableBundle?)")
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }




    override fun onLowMemory() {
        logger("onLowMemory")
        super.onLowMemory()
    }

}