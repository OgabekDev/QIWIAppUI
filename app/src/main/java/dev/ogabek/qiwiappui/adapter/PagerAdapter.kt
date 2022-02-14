package dev.ogabek.qiwiappui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.qiwiappui.R
import dev.ogabek.qiwiappui.model.Pager

class PagerAdapter(private val list: List<Pager>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pager_item, parent, false)
        return PagerViewHolder(view)
    }

    class PagerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.iv_pager_item)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pager = list[position]

        if (holder is PagerViewHolder) {
            holder.apply {
                image.setImageResource(pager.photo)
            }
        }
    }

    override fun getItemCount() = list.size

}