package com.agat.customtoast

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {

    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context =applicationContext
    }


    fun showInfoToast(view: View) {
        //CustomToastClass.showInfoToast(this@MainActivity,"Ashish  Pujari",ResourcesCompat.getFont(context,R.font.google_sans_regular),Toast.LENGTH_LONG)
    }
    fun showErrorToast(view: View) {
        //CustomToastClass.showErrorToast(this@MainActivity,"Error",ResourcesCompat.getFont(context,R.font.google_sans_regular),Toast.LENGTH_LONG)
    }
    fun showWarning(view: View) {
        //CustomToastClass.showWarningToast(this@MainActivity,"Warning",ResourcesCompat.getFont(context,R.font.google_sans_regular),Toast.LENGTH_LONG)
    }
    fun showSuccess(view: View) {
        //CustomToastClass.showSuccessToast(this@MainActivity,"Success",ResourcesCompat.getFont(context,R.font.google_sans_regular),Toast.LENGTH_LONG)
    }
}
