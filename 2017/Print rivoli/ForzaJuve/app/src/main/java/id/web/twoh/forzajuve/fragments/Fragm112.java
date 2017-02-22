package id.web.twoh.forzajuve.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import id.web.twoh.forzajuve.R;

/**
 * Created by Seven on 16-Dec-16.
 */

public class Fragm112 extends Fragment implements View.OnClickListener {

    MediaPlayer mp;
    ImageButton wa, fa, kaa, ya, wawa, fafa, kaka1, yaya, wawaa, fafaa, kakaa1, yayaa, wafa, vawa, kaya, yaka, waka, faya, kawa, yafa, www, fff, kkk, yyy, wfk, fky, kfw, ykf, wky, fyw, kwf, yfk, wfky, fwky, fwyk, ykfw;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragm112, container, false);

        wa = (ImageButton) view.findViewById(R.id.wa);
        fa = (ImageButton) view.findViewById(R.id.fa);
        kaa = (ImageButton) view.findViewById(R.id.kaa);
        ya = (ImageButton) view.findViewById(R.id.ya);
        wawa = (ImageButton) view.findViewById(R.id.wawa);
        fafa = (ImageButton) view.findViewById(R.id.fafa);
        kaka1 = (ImageButton) view.findViewById(R.id.kaka1);
        yaya = (ImageButton) view.findViewById(R.id.yaya);
        wawaa = (ImageButton) view.findViewById(R.id.wawaa);
        fafaa = (ImageButton) view.findViewById(R.id.fafaa);
        kakaa1 = (ImageButton) view.findViewById(R.id.kakaa1);
        yayaa = (ImageButton) view.findViewById(R.id.yayaa);
        wafa  = (ImageButton) view.findViewById(R.id.wafa);
        vawa  = (ImageButton) view.findViewById(R.id.vawa);
        kaya  = (ImageButton) view.findViewById(R.id.kaya);
        yaka  = (ImageButton) view.findViewById(R.id.yaka);
        waka  = (ImageButton) view.findViewById(R.id.waka);
        faya  = (ImageButton) view.findViewById(R.id.faya);
        kawa  = (ImageButton) view.findViewById(R.id.kawa);
        yafa  = (ImageButton) view.findViewById(R.id.yafa);
        www = (ImageButton) view.findViewById(R.id.www);
        fff = (ImageButton) view.findViewById(R.id.fff);
        kkk = (ImageButton) view.findViewById(R.id.kkk);
        yyy = (ImageButton) view.findViewById(R.id.yyy);
        wfk = (ImageButton) view.findViewById(R.id.wfk);
        fky = (ImageButton) view.findViewById(R.id.fky);
        kfw = (ImageButton) view.findViewById(R.id.kfw);
        ykf = (ImageButton) view.findViewById(R.id.ykf);
        wky = (ImageButton) view.findViewById(R.id.wky);
        fyw = (ImageButton) view.findViewById(R.id.fwy);
        kwf = (ImageButton) view.findViewById(R.id.kwf);
        yfk = (ImageButton) view.findViewById(R.id.yfk);
        wfky = (ImageButton) view.findViewById(R.id.wfky);
        fwky = (ImageButton) view.findViewById(R.id.fwky);
        fwyk = (ImageButton) view.findViewById(R.id.fwyk);
        ykfw = (ImageButton) view.findViewById(R.id.ykfw);


        wa.setOnClickListener(this);
        fa.setOnClickListener(this);
        kaa.setOnClickListener(this);
        ya.setOnClickListener(this);
        wawa.setOnClickListener(this);
        fafa.setOnClickListener(this);
        kaka1.setOnClickListener(this);
        yaya.setOnClickListener(this);
        wawaa.setOnClickListener(this);
        fafaa.setOnClickListener(this);
        kakaa1.setOnClickListener(this);
        yayaa.setOnClickListener(this);
        wafa.setOnClickListener(this);
        vawa.setOnClickListener(this);
        kaya.setOnClickListener(this);
        yaka.setOnClickListener(this);
        waka.setOnClickListener(this);
        faya.setOnClickListener(this);
        kawa.setOnClickListener(this);
        yafa.setOnClickListener(this);
        www.setOnClickListener(this);
        fff.setOnClickListener(this);
        kkk.setOnClickListener(this);
        yyy.setOnClickListener(this);
        wfk.setOnClickListener(this);
        fky.setOnClickListener(this);
        kfw.setOnClickListener(this);
        ykf.setOnClickListener(this);
        wky.setOnClickListener(this);
        fyw.setOnClickListener(this);
        kwf.setOnClickListener(this);
        yfk.setOnClickListener(this);
        wfky.setOnClickListener(this);
        fwky.setOnClickListener(this);
        fwyk.setOnClickListener(this);
        ykfw.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.wa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1121wa);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1122fa);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1123ka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.ya:
                mp = MediaPlayer.create(getActivity(), R.raw.a1124ya);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.wawa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1125wawa);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fafa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1126fafa);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kaka1:
                mp = MediaPlayer.create(getActivity(), R.raw.a1127kaka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.yaya:
                mp = MediaPlayer.create(getActivity(), R.raw.a1128yaya);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.wawaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1129wawa);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fafaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11210fafa);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kakaa1:
                mp = MediaPlayer.create(getActivity(), R.raw.a11211kaka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.yayaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11212yaya);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.wafa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11213wf);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.vawa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11214fw);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kaya:
                mp = MediaPlayer.create(getActivity(), R.raw.a11215ky);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.yaka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11216yk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.waka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11217wk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.faya:
                mp = MediaPlayer.create(getActivity(), R.raw.a11218fy);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kawa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11219kw);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.yafa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11220yf);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.www:
                mp = MediaPlayer.create(getActivity(), R.raw.a11221www);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fff:
                mp = MediaPlayer.create(getActivity(), R.raw.a11222fff);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kkk:
                mp = MediaPlayer.create(getActivity(), R.raw.a11223kkk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.yyy:
                mp = MediaPlayer.create(getActivity(), R.raw.a11224yyy);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.wfk:
                mp = MediaPlayer.create(getActivity(), R.raw.a11225wfk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fky:
                mp = MediaPlayer.create(getActivity(), R.raw.a11226fky);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kfw:
                mp = MediaPlayer.create(getActivity(), R.raw.a11227kfw);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.ykf:
                mp = MediaPlayer.create(getActivity(), R.raw.a11228ykf);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.wky:
                mp = MediaPlayer.create(getActivity(), R.raw.a11229wky);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fwy:
                mp = MediaPlayer.create(getActivity(), R.raw.a11230fyw);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kwf:
                mp = MediaPlayer.create(getActivity(), R.raw.a11231kwf);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.yfk:
                mp = MediaPlayer.create(getActivity(), R.raw.a11232yfk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.wfky:
                mp = MediaPlayer.create(getActivity(), R.raw.a11233wfky);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fwky:
                mp = MediaPlayer.create(getActivity(), R.raw.a11234fwky);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.fwyk:
                mp = MediaPlayer.create(getActivity(), R.raw.a11235fwyk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.ykfw:
                mp = MediaPlayer.create(getActivity(), R.raw.a11236ykfw);
                mp.start();
                mp.setLooping(false);
                break;
        }

    }
}

