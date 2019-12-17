package io.github.mbaguszulmi.tripstory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_IMAGE_TRIP = "extra_image_trip"
        const val EXTRA_AVATAR = "extra_avatar"
        const val EXTRA_USER = "extra_user"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val location = intent.getStringExtra(EXTRA_LOCATION)
        val imageTrip = intent.getIntExtra(EXTRA_IMAGE_TRIP, 0)
        val avatar = intent.getIntExtra(EXTRA_AVATAR, 0)
        val user = intent.getStringExtra(EXTRA_USER)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        val tvTripTitle = findViewById<TextView>(R.id.tv_trip_title)
        val tvTripLocation = findViewById<TextView>(R.id.tv_trip_location)
        val tvTripDetail = findViewById<TextView>(R.id.tv_trip_detail)
        val tvUser = findViewById<TextView>(R.id.tv_user)
        val ivTripImage = findViewById<ImageView>(R.id.iv_trip_image)
        val ivAvatar = findViewById<CircleImageView>(R.id.iv_avatar);

        tvTripTitle.text = title
        tvTripLocation.text = location
        tvTripDetail.text = detail
        tvUser.text = user
        Glide.with(this)
            .load(imageTrip)
            .apply(RequestOptions().override(700, 600))
            .into(ivTripImage)

        Glide.with(this)
            .load(avatar)
            .apply(RequestOptions().override(50, 50))
            .into(ivAvatar)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true);
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
