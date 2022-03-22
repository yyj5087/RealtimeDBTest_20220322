package com.example.realtimedbtest_20220322.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.realtimedbtest_20220322.R
import com.example.realtimedbtest_20220322.datas.ChattingData

class ChattingRecyclerAdapter(
    val mContext: Context,
    val mList: List<ChattingData>
) : RecyclerView.Adapter<ChattingRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val txtContent = view.findViewById<TextView>(R.id.txtContent)
        val txtCreatedAt = view.findViewById<TextView>(R.id.txtCreatedAt)

        fun bing(data: ChattingData) {

            txtContent.text = data.content
            txtCreatedAt.text = data.createdAt

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =
            LayoutInflater.from(mContext).inflate(R.layout.chatting_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val data = mList[position]
        holder.bing(data)
    }

    override fun getItemCount() = mList.size

}