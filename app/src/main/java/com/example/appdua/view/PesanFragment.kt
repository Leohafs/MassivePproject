package com.example.appdua.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appdua.model.Pesan
import com.example.appdua.modelview.PesanAdapter
import com.example.appdua.R

/**
 * A simple [Fragment] subclass.
 * Use the [PesanFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PesanFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var adapter: PesanAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var pesanList : ArrayList<Pesan>

    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    private lateinit var deskripsi : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesan, container, false)
    }

//    menampilkan recycle view
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailinitiallize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.Recyle_pesan)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = PesanAdapter(pesanList)
        recyclerView.adapter = adapter
    }

    private fun detailinitiallize(){

        pesanList = arrayListOf()

        imageId = arrayOf(
            R.drawable.img_ps1,
            R.drawable.img_ps2,
            R.drawable.img_ps3,
            R.drawable.img_ps4,
            R.drawable.img_ps5,
            R.drawable.img_ps6,
        )

        heading = arrayOf(
            getString(R.string.nama_toko1),
            getString(R.string.nama_toko2),
            getString(R.string.nama_toko3),
            getString(R.string.nama_toko4),
            getString(R.string.nama_toko5),
            getString(R.string.nama_toko6),
        )

        deskripsi = arrayOf(
            getString(R.string.dk_ps_toko),
            getString(R.string.dk_ps_toko),
            getString(R.string.dk_ps_toko),
            getString(R.string.dk_ps_toko),
            getString(R.string.dk_ps_toko),
            getString(R.string.dk_ps_toko),
        )

        for (i in imageId.indices) {
            val pesan = Pesan(imageId[i], heading[i], deskripsi[i])
            pesanList.add(pesan)
        }
    }
}