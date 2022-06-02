package com.geektech.android1_less6_recylerview_isakova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.geektech.android1_less6_recylerview_isakova.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val data = arrayListOf<Language>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        var adapter = LanguageAdapter(data = data)
        binding.recyclerView.adapter = adapter
        binding.recyclerView = GridLayoutManager(requireContext(), 2)
    }

    private fun loadData() {
        data.add(
            Language(
                R.color.purple_500, "Kotlin",
                "https://static.tumblr.com/4ef59bd910d36ba073335b26c119f6f1/e0bthr6/WU5p5tzjc/tumblr_static_tumblr_static_bfo4zx2883wokows00ggkgg0c_focused_v3.png"
            )
        )
        data.add(
            Language(
                R.color.white, "Java",
                "https://andreyex.ru/wp-content/uploads/2018/05/Kak-ustanovit-Java-s-apt-na-Ubuntu-18.04.jpg"
            )
        )
        data.add(
            Language(
                R.color.green, "Javascript",
                "https://cs11.pikabu.ru/post_img/2020/02/29/11/og_og_1583005972263333358.jpg"
            )
        )
        data.add(
            Language(
                R.color.yellow, "Python",
                "https://fuzeservers.ru/wp-content/uploads/7/e/8/7e81772f936123cb6d9af13c5ef24925.png"
            )
        )
    }


}