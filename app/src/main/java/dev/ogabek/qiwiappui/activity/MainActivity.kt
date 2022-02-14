package dev.ogabek.qiwiappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.qiwiappui.R
import dev.ogabek.qiwiappui.adapter.PayAdapter
import dev.ogabek.qiwiappui.model.Pay

class MainActivity : AppCompatActivity() {

    private lateinit var rv_pay:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        rv_pay = findViewById(R.id.rv_pay)
        rv_pay.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
        val adapter = PayAdapter(getAllPayTypes())
        rv_pay.adapter = adapter
    }

    private fun getAllPayTypes(): List<Pay> {
        val payList: ArrayList<Pay> = ArrayList()

        payList.add(Pay(R.drawable.pay_qiwi, "На QIWI Кашелек"))
        payList.add(Pay(R.drawable.pay_discount, "Превод по цкитки"))
        payList.add(Pay(R.drawable.pay_card, "Превод на карту"))
        payList.add(Pay(R.drawable.pay_phone, "мобильная цвязь"))

        return payList
    }

}