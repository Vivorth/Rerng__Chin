package com.example.rerngchin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.investigation.view.*

class investFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view: View = inflater.inflate(R.layout.investigation, container, false)
        MobileAds.initialize(context)
        view.adview1.loadAd(AdRequest.Builder().build())
        view.adview1.bringToFront()
        view.athireach_jombang.setOnClickListener {
            startActivity(Intent(context,athireach_jombang::class.java))
        }
        view.bongpaoun.setOnClickListener {
            startActivity(Intent(context,bongpaoun::class.java))
        }
        view.entri_tep.setOnClickListener {
            startActivity(Intent(context,entritep::class.java))
        }
        view.inker.setOnClickListener {
            startActivity(Intent(context,inker::class.java))
        }
        view.javjilong.setOnClickListener {
            startActivity(Intent(context,javjilong::class.java))
        }
        view.jikong.setOnClickListener {
            startActivity(Intent(context,jikong::class.java))
        }
        view.jusean2.setOnClickListener {
            startActivity(Intent(context,jusean2::class.java))
        }
        view.kompheng.setOnClickListener {
            startActivity(Intent(context,kompheng::class.java))
        }
        view.mohitrith_tmor.setOnClickListener {
            startActivity(Intent(context,mohitrith_tmor::class.java))
        }

        view.nekbromanh.setOnClickListener {
            startActivity(Intent(context,nekbromanh::class.java))
        }
        view.nekklahan_davtep.setOnClickListener {
            startActivity(Intent(context,nekklahan_davtep::class.java))
        }
        view.nisaisne_davtep.setOnClickListener {
            startActivity(Intent(context,nisaisne_daptep::class.java))
        }
        view.nisaisne_tevada.setOnClickListener {
            startActivity(Intent(context,nisaisne_tevada::class.java))
        }
        view.nisaisne_tevada3jeat.setOnClickListener {
            startActivity(Intent(context,nisaisne_tevada3jeat::class.java))
        }
        view.nisaisne_thansur.setOnClickListener {
            startActivity(Intent(context,nisaisne_thansur::class.java))
        }
        view.oumeyneang.setOnClickListener {
            startActivity(Intent(context,oumeyneang::class.java))
        }
        view.pjuskambit.setOnClickListener {
            startActivity(Intent(context,pjuskambit::class.java))
        }
        view.preahneang_toch.setOnClickListener {
            startActivity(Intent(context,preahneangtoch::class.java))
        }
        view.preng_davboran.setOnClickListener {
            startActivity(Intent(context,preng_davboran::class.java))
        }
        view.proyuth_tovmek.setOnClickListener {
            startActivity(Intent(context,proyuth_tovmek::class.java))
        }

        view.snevealksach.setOnClickListener {
            startActivity(Intent(context,snevealksach::class.java))
        }
        view.tolaka.setOnClickListener {
            startActivity(Intent(context,tolaka::class.java))
        }
        view.torb_amatak.setOnClickListener {
            startActivity(Intent(context,torb_amatak::class.java))
        }
        view.yuthsil_bongvil.setOnClickListener {
            startActivity(Intent(context,yuthsil_bongvil::class.java))
        }



        return view
    }
}