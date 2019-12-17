package io.github.mbaguszulmi.tripstory

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.mbaguszulmi.tripstory.adapter.ListTripAdapter
import io.github.mbaguszulmi.tripstory.model.Trip
import io.github.mbaguszulmi.tripstory.model.TripData

class MainActivity : AppCompatActivity() {
    private lateinit var rvTrip: RecyclerView
    private var list: ArrayList<Trip> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTrip = findViewById(R.id.rv_trip)
        rvTrip.setHasFixedSize(true)

        list.addAll(TripData.listData)
        showRecyclerList()
    }

    fun onTripClicked(data: Trip) {
        Toast.makeText(this, "Memuat "+data.title, Toast.LENGTH_SHORT).show()

        val detailIntent = Intent(this@MainActivity,  DetailActivity::class.java)
        detailIntent.putExtra(DetailActivity.EXTRA_TITLE, data.title)
        detailIntent.putExtra(DetailActivity.EXTRA_LOCATION, data.location)
        detailIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.tripDetail)
        detailIntent.putExtra(DetailActivity.EXTRA_USER, data.user)
        detailIntent.putExtra(DetailActivity.EXTRA_IMAGE_TRIP, data.tripImage)
        detailIntent.putExtra(DetailActivity.EXTRA_AVATAR, data.userAvatar)

        startActivity(detailIntent)
    }


    private fun showRecyclerList() {
        rvTrip.layoutManager = LinearLayoutManager(this)
        val listTripAdapter = ListTripAdapter(list)
        rvTrip.adapter = listTripAdapter

        listTripAdapter.setOnItemClickCallback(object: ListTripAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Trip) {
                onTripClicked(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.action_profile -> {
                val profileIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(profileIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
