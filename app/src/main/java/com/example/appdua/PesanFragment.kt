package com.example.appdua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PesanFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PesanFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: PesanAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var pesanList : ArrayList<Pesan>

    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    private lateinit var deskripsi : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesan, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PesanFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PesanFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
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
            val pesan = Pesan(imageId[i], heading[i],deskripsi[i])
            pesanList.add(pesan)
        }
    }
}