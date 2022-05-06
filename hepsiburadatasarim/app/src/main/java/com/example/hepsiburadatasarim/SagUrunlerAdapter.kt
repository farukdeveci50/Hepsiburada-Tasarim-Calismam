package com.example.hepsiburadatasarim

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadatasarim.databinding.CardTasarim1Binding
import com.example.hepsiburadatasarim.databinding.CardTasarim2Binding

class SagUrunlerAdapter (var mContext:Context,var sagUrunlerListesi:List<SagUrunler>) : RecyclerView.Adapter<SagUrunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim:CardTasarim2Binding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: CardTasarim2Binding
        init {
            this.tasarim=tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarim2Binding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = sagUrunlerListesi.get(position)
        val t = holder.tasarim
        t.imageView.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))
        t.textView.text =urun.urunAdi
    }

    override fun getItemCount(): Int {
        return sagUrunlerListesi.size
    }
}