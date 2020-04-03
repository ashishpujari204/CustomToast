package com.agat.customtoast

import android.app.Activity
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.toast_layout.view.*
import java.time.Duration

class CustomToastClass {
    companion object {
        val GRAVITY_TOP = 48
        val GRAVITY_CENTER = 17
        val GRAVITY_BOTTOM = 80
        private lateinit var layoutInflater: LayoutInflater
        fun infoToast(context: Activity, message: String, position: Int) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.toast_layout, (context).findViewById(R.id.custom_toast_layout))
            layout.custom_toast_image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_information))
            val drawable = ContextCompat.getDrawable(context, R.drawable.toast_background)
            drawable?.colorFilter = PorterDuffColorFilter(ContextCompat.getColor(context, R.color.colorAccent), PorterDuff.Mode.MULTIPLY)
            layout.background = drawable
            layout.custom_toast_message.setTextColor(Color.WHITE)
            layout.custom_toast_message.text = message
            val toast = Toast(context.applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            if (position == GRAVITY_BOTTOM) {
                toast.setGravity(position, 0, 20)
            } else {
                toast.setGravity(position, 0, 0)
            }
            toast.view = layout //setting the view of custom toast layout
            toast.show()
        }
        fun infoToast(
            context: Activity, message: String, position: Int, font: Typeface?,
            backgroundColor: Int, textColor: Int,
            icon: Drawable?,duration: Int
        ) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.toast_layout, (context).findViewById(R.id.custom_toast_layout))
            layout.custom_toast_image.setImageDrawable(icon)
            val drawable = ContextCompat.getDrawable(context, R.drawable.toast_background)
            drawable?.colorFilter = PorterDuffColorFilter(backgroundColor, PorterDuff.Mode.MULTIPLY)
            layout.background = drawable
            layout.custom_toast_message.setTextColor(textColor)
            layout.custom_toast_message.text = message
            font?.let {
                layout.custom_toast_message.typeface = font
            }
            val toast = Toast(context.applicationContext)
            toast.duration = duration
            if (position == GRAVITY_BOTTOM) {
                toast.setGravity(position, 0, 20)
            } else {
                toast.setGravity(position, 0, 0)
            }
            toast.view = layout//setting the view of custom toast layout
            toast.show()
        }

        fun  showInfoToast(context: Activity,message : String,font :Typeface?,duration: Int) {
            infoToast(context, "$message", CustomToastClass.GRAVITY_BOTTOM, font,ContextCompat.getColor(context, R.color.info),ContextCompat.getColor(context, R.color.info_background),ContextCompat.getDrawable(context, R.drawable.ic_information),duration)
        }
        fun  showErrorToast(context: Activity,message : String,font :Typeface?,duration: Int) {
            infoToast(context, "$message", CustomToastClass.GRAVITY_BOTTOM, font,ContextCompat.getColor(context, R.color.error),ContextCompat.getColor(context, R.color.error_background),ContextCompat.getDrawable(context, R.drawable.ic_cancel),duration)
        }
        fun  showSuccessToast(context: Activity,message : String,font :Typeface?,duration: Int) {
            infoToast(context, "$message", CustomToastClass.GRAVITY_BOTTOM, font,ContextCompat.getColor(context, R.color.success),ContextCompat.getColor(context, R.color.success_background),ContextCompat.getDrawable(context, R.drawable.ic_check),duration)
        }
        fun  showWarningToast(context: Activity,message : String,font :Typeface?,duration: Int) {
            infoToast(context, "$message", CustomToastClass.GRAVITY_BOTTOM, font,ContextCompat.getColor(context, R.color.warning),ContextCompat.getColor(context, R.color.warning_background),ContextCompat.getDrawable(context, R.drawable.ic_warning),duration)
        }
    }


}