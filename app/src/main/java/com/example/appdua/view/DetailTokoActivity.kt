package com.example.appdua.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appdua.R
import com.example.appdua.modelview.DetailTokoAdapter
import com.google.android.material.tabs.TabLayout

class DetailTokoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_toko)

        val btnpesan : Button = findViewById(R.id.btn_psntoko)
        btnpesan.setOnClickListener(this)

        var viewPager : ViewPager = findViewById(R.id.vp_toko)
        var tabLayout : TabLayout = findViewById(R.id.tab_layout)

        val fragmentAdapter = DetailTokoAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(ProdukTokoFragment(),"Produk")
        fragmentAdapter.addFragment(KategoriTokoFragment(), "Kategori")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_psntoko -> {
                val intent = Intent(this, DetailPesanActivity::class.java)
                startActivity(intent)
            }
        }
    }
}