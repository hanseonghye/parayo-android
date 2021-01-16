package com.example.parayo.product

import android.os.Bundle
import android.os.PersistableBundle
import net.codephobia.ankomvvm.components.BaseActivity
import org.jetbrains.anko.setContentView
import kotlin.reflect.KClass

class ProductMainActivity :
    BaseActivity<ProductMainViewModel>() {
    override val viewModelType = ProductMainViewModel::class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProductMainUi(getViewModel())
            .setContentView(this)
    }

}