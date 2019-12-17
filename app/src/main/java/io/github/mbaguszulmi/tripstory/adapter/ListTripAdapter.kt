package io.github.mbaguszulmi.tripstory.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView
import io.github.mbaguszulmi.tripstory.R
import io.github.mbaguszulmi.tripstory.model.Trip

class ListTripAdapter(private val listTrip: ArrayList<Trip>) : RecyclerView.Adapter<ListTripAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_trip, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTrip.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val trip = listTrip[position]

        Glide.with(holder.itemView.context)
            .load(trip.tripImage)
            .apply(RequestOptions().override(711, 400))
            .into(holder.imgItemtrip)

        holder.tvItemTitle.text = trip.title
        holder.tvLocation.text = trip.location
        holder.tvDetail.text = trip.tripDetail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTrip[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvItemTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_location)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgItemtrip: ImageView = itemView.findViewById(R.id.img_item_trip)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Trip)
    }
}
