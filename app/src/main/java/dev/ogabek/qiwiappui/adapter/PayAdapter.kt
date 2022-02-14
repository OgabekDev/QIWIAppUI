package dev.ogabek.qiwiappui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.qiwiappui.R
import dev.ogabek.qiwiappui.model.Pay

class PayAdapter(private val payList: List<Pay>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pay, parent, false)
        return PayViewHolder(view)
    }

    class PayViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.iv_pay_icon)
        val title: TextView = view.findViewById(R.id.tv_pay_title)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pay = payList[position]

        if (holder is PayViewHolder) {
            holder.apply {
                image.setImageResource(pay.picture)
                title.text = pay.title
            }
        }
    }

    override fun getItemCount() = payList.size
}