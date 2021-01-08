package com.example.parayo.signup

import android.os.Bundle
import android.os.PersistableBundle
import net.codephobia.ankomvvm.components.BaseActivity
import org.jetbrains.anko.setContentView

class SignupActivity : BaseActivity<SignupViewModel>() {
    override val viewModelType = SignupViewModel::class


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ui를 붙여준다.
        // SignupActivityUI의 생성자에서 SignupViewModel을 필요로 하므로
        // getViewModel()을 통해 미리 준비된 SignupViewModel 객체를 주입한다.
        SignupActivityUI(getViewModel())
            .setContentView(this)
    }

}