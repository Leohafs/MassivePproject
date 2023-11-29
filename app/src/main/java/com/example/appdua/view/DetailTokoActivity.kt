package com.example.appdua.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appdua.R
import com.example.appdua.modelview.DetailTokoAdapter
import com.google.android.material.tabs.TabLayout

class DetailTokoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_toko)

        var viewPager : ViewPager = findViewById(R.id.vp_toko)
        var tabLayout : TabLayout = findViewById(R.id.tab_layout)

        val fragmentAdapter = DetailTokoAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(ProdukTokoFragment(),"Produk")
        fragmentAdapter.addFragment(KategoriTokoFragment(), "Kategori")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

    }
}