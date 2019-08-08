package com.lambdaschool.appstructuredemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.lambdaschool.appstructuredemo.util.
import com.lambdaschool.appstructuredemo.R
import com.lambdaschool.appstructuredemo.model.Order
import com.lambdaschool.appstructuredemo.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Order Details"
    }

    private fun displayOrderDetails(order: Order) {
        discount_view.text = TextUtils.formatPercent(order.discount)
        orderDate_view
        price_view
        tax_view
        customer_first_view
        customer_last_view
    }
}
