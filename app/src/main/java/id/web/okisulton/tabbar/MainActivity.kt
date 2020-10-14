package id.web.okisulton.tabbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import id.web.okisulton.tabbar.adapter.PagerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mPagerAdapter: PagerAdapter
    private lateinit var mViewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewPager = findViewById(R.id.mViewPager)

        mPagerAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerAdapter
        mViewPager.offscreenPageLimit = 5

        //add page change listener
        mViewPager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                changingTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })
        //default tab
        mViewPager.currentItem = 0
        nav_home.setImageResource(R.drawable.ic_home_pink)

    }

    private fun changingTabs(position: Int) {
        if (position == 0){
            nav_home.setImageResource(R.drawable.ic_home_pink)
            nav_search.setImageResource(R.drawable.ic_search)
            nav_add.setImageResource(R.drawable.ic_add)
            nav_notif.setImageResource(R.drawable.ic_notifications)
            nav_profil.setImageResource(R.drawable.ic_profil)
        }
        if (position == 1){
            nav_home.setImageResource(R.drawable.ic_home)
            nav_search.setImageResource(R.drawable.ic_search_pink)
            nav_add.setImageResource(R.drawable.ic_add)
            nav_notif.setImageResource(R.drawable.ic_notifications)
            nav_profil.setImageResource(R.drawable.ic_profil)
        }
        if (position == 2){
            nav_home.setImageResource(R.drawable.ic_home)
            nav_search.setImageResource(R.drawable.ic_search)
            nav_add.setImageResource(R.drawable.ic_add_pink)
            nav_notif.setImageResource(R.drawable.ic_notifications)
            nav_profil.setImageResource(R.drawable.ic_profil)
        }
        if (position == 3){
            nav_home.setImageResource(R.drawable.ic_home)
            nav_search.setImageResource(R.drawable.ic_search)
            nav_add.setImageResource(R.drawable.ic_add)
            nav_notif.setImageResource(R.drawable.ic_notifications_pink)
            nav_profil.setImageResource(R.drawable.ic_profil)
        }
        if (position == 4){
            nav_home.setImageResource(R.drawable.ic_home)
            nav_search.setImageResource(R.drawable.ic_search)
            nav_add.setImageResource(R.drawable.ic_add)
            nav_notif.setImageResource(R.drawable.ic_notifications)
            nav_profil.setImageResource(R.drawable.ic_profil_pink)
        }
    }
}