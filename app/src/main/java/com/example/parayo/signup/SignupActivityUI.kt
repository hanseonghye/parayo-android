package com.example.parayo.signup

import android.view.Gravity
import android.widget.LinearLayout
import org.jetbrains.anko.*

class SignupActivityUI(private val viewModel: SignupViewModel): AnkoComponent<SignupActivity> {
    override fun createView(ui: AnkoContext<SignupActivity>) =
        ui.linearLayout{
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_VERTICAL
            padding = dip(20)
        }
}