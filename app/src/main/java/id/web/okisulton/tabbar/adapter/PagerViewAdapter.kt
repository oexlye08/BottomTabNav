package id.web.okisulton.tabbar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import id.web.okisulton.tabbar.Fragments.*

internal class PagerViewAdapter (fm:FragmentManager?) : FragmentPagerAdapter(fm!!){
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                HomeFragment()
            }
            1 -> {
                SearchFragment()
            }
            2 -> {
                AddFragment()
            }
            3 -> {
                NotificationFragment()
            }
            4 -> {
                ProfilFragment()
            }
            else -> HomeFragment()

        }
    }

}