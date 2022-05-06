package com.example.hepsiburadatasarim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hepsiburadatasarim.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.rv1.layoutManager = LinearLayoutManager(requireContext())

        val solUrunlerListesi =ArrayList<SolUrunler>()
        val sol1 = SolUrunler("resim7","Popüler Kategoriler")
        val sol2 = SolUrunler("resim2","Telefon, Tablet ve Aksesuarlar")
        val sol3 = SolUrunler("resim3","Bilgisayar, Teknoloji, Elektronik")
        val sol4 = SolUrunler("resim4","TV, Görüntü ve Ses Sistemleri")
        val sol5 = SolUrunler("resim5","Beyaz Eşya, Isıtma ve Soğutma")
        val sol6 = SolUrunler("resim6","Elektrikli Ev Aletleri")

        solUrunlerListesi.add(sol1)
        solUrunlerListesi.add(sol2)
        solUrunlerListesi.add(sol3)
        solUrunlerListesi.add(sol4)
        solUrunlerListesi.add(sol5)
        solUrunlerListesi.add(sol6)

        val adapter = SolUrunlerAdapter(requireContext(),solUrunlerListesi)
        tasarim.rv1.adapter = adapter

        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val sagUrunlerListesi = ArrayList<SagUrunler>()
        val sag1 = SagUrunler("resimm1","Spor Giyim - Aksesuar")
        val sag2 = SagUrunler("resimm2","Android Telefonlar")
        val sag3 = SagUrunler("resimm3","Süpürgeler")
        val sag4 = SagUrunler("resimm4","Kamp & Kampçılık Malzemeleri")
        val sag5 = SagUrunler("resimm5","Sofra, Servis & Sunum")
        val sag6 = SagUrunler("resimm6","Giyim")
        val sag7 = SagUrunler("resimm7","Saç Bakım Ürünleri")
        val sag8 = SagUrunler("resimm8","Giyim")
        val sag9 = SagUrunler("resimm9","Ayakkabı")
        val sag10 = SagUrunler("resimm10","Çeyiz Seti")
        val sag11 = SagUrunler("resimm11","Akıllı Saatler")
        val sag12 = SagUrunler("resimm12","Cilt Bakım")


        sagUrunlerListesi.add(sag1)
        sagUrunlerListesi.add(sag2)
        sagUrunlerListesi.add(sag3)
        sagUrunlerListesi.add(sag4)
        sagUrunlerListesi.add(sag5)
        sagUrunlerListesi.add(sag6)
        sagUrunlerListesi.add(sag7)
        sagUrunlerListesi.add(sag8)
        sagUrunlerListesi.add(sag9)
        sagUrunlerListesi.add(sag10)
        sagUrunlerListesi.add(sag11)
        sagUrunlerListesi.add(sag12)

        val adapter2 = SagUrunlerAdapter(requireContext(),sagUrunlerListesi)
        tasarim.rv2.adapter = adapter2


        return tasarim.root
    }


}