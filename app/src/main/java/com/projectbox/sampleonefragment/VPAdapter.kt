package com.projectbox.sampleonefragment

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager

/**
 * Created by adinugroho
 */
class VPAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    private val titles = listOf("Kiri", "Kanan")

    override fun getItem(position: Int): Fragment = MainFragment.newInstance(titles[position])

    override fun getCount(): Int = titles.size

    override fun getPageTitle(position: Int): CharSequence? = titles[position]
}