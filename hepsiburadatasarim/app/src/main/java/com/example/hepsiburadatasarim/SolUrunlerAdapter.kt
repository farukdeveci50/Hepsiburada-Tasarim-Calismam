package com.example.hepsiburadatasarim

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburadatasarim.databinding.CardTasarim1Binding

class SolUrunlerAdapter (var mContext:Context,var solUrunlerListesi:List<SolUrunler>) : RecyclerView.Adapter<SolUrunlerAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(tasarim:CardTasarim1Binding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim:CardTasarim1Binding
        init {
            this.tasarim=tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {//Tasarım bağlantımızı sağlıyoruz.
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarim1Binding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {//Verileri görüntüleme ve işleme kısmını yaptığımız yer.
        val urun = solUrunlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewSolUrunAdi.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))
        t.textViewSolUrunAdi.text =urun.urunAdi
    }

    override fun getItemCount(): Int {//Kaç veri işleyeceğimizi gösteriyor.
        return solUrunlerListesi.size
    }
}