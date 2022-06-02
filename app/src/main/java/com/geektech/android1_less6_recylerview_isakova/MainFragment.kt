package com.geektech.android1_less6_recylerview_isakova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.geektech.android1_less6_recylerview_isakova.databinding.ActivityMainBinding
import com.geektech.android1_less6_recylerview_isakova.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    lateinit var binding:FragmentMainBinding

    //private var btn: Button?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // btn=view.findViewById(R.id.btn_click)

        binding.btn?.setOnClickListener {
        replaceFragment(SecondFragment())
        }
    }


}