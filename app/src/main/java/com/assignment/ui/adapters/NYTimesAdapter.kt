package com.assignment.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.assignment.databinding.ArticleItemBinding
import com.assignment.model.ResultsItem
import com.assignment.ui.interfaces.Callback

class NYTimesAdapter(private val mCallBack: Callback) :
    ListAdapter<ResultsItem, NYTimesAdapter.ViewHolder>(
        DataDiffCallBack()
    ) {

    /**
     * CREATING VIEW
     * FOR EACH ITEM
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ArticleItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    /**
     * VIEW BINDER
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), mCallBack)
    }

    /**
     * VIEW HOLDER
     * SET DATA TO VIEWS
     */
    class ViewHolder(private val binding: ArticleItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ResultsItem, mCallBack: Callback) {
            binding.item = item
            binding.click = mCallBack
        }
    }
}

private class DataDiffCallBack : DiffUtil.ItemCallback<ResultsItem>() {
    override fun areItemsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean =
        oldItem == newItem
}
