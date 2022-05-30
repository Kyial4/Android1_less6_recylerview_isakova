package com.geektech.android1_less6_recylerview_isakova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
private val data= arrayListOf<Language>()
    private var recyclerView:RecyclerView?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        recyclerView=view.findViewById(R.id.recycler_view)
        var adapter=LanguageAdapter(data=data)
        recyclerView?.adapter=adapter
        recyclerView?.layoutManager= GridLayoutManager(requireContext(),2)
    }

    private fun loadData() {
        data.add(Language(R.color.purple_500,"Kotlin",
            "https://static.tumblr.com/4ef59bd910d36ba073335b26c119f6f1/e0bthr6/WU5p5tzjc/tumblr_static_tumblr_static_bfo4zx2883wokows00ggkgg0c_focused_v3.png"))
        data.add(Language(R.color.white,"Java",
            "https://andreyex.ru/wp-content/uploads/2018/05/Kak-ustanovit-Java-s-apt-na-Ubuntu-18.04.jpg"))
        data.add(Language(R.color.green,"Javascript",
            "https://cs11.pikabu.ru/post_img/2020/02/29/11/og_og_1583005972263333358.jpg"))
        data.add(Language(R.color.yellow,"Python",
            "https://fuzeservers.ru/wp-content/uploads/7/e/8/7e81772f936123cb6d9af13c5ef24925.png"))
    }


}