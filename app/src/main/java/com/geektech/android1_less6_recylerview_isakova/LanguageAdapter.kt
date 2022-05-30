package com.geektech.android1_less6_recylerview_isakova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class LanguageAdapter(private val data:ArrayList<Language>): RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
       return LanguageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_laguages, parent, false))
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    override fun getItemCount(): Int =data.size


   inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
       private var languageName:TextView? =null
       private lateinit var languageImage:ImageView
       private var languageColor:ConstraintLayout? =null
       fun bind (language:Language){
           languageName=itemView.findViewById(R.id.tv_language)
           languageImage=itemView.findViewById(R.id.image_language)
           languageColor=itemView.findViewById(R.id.parent)

           languageName?.text=language.name
           language.color?.let { languageColor?.setBackgroundColor(itemView.context.getColor(it)) }
           Glide.with(languageImage).load("http://goo.gl/gEgYUd").into(languageImage);

       }
   }
}