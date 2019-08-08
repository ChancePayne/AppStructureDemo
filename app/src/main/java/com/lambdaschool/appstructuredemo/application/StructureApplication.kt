package com.lambdaschool.appstructuredemo.application

import android.app.Application
import com.lambdaschool.appstructuredemo.model.Order

class StructureApplication: Application() {

    public val appOrder = Order(customerFirstName = "Demo Application")

    override fun onCreate() {
        super.onCreate()
    }
}