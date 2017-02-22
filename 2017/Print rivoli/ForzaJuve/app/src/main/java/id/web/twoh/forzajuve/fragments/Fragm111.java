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

public class Fragm111 extends Fragment implements View.OnClickListener {

    MediaPlayer mp;
    ImageButton ka, ta, ba, na, kaka, tata, baba, nana, kakaa, tataa, babaa, nanaa, kata, taka, bana, naba, kaba, tana, baka, nata, kkk, ttt, bbb, nnn, ktb, tbn, btk, nkt, kbn, tnk, bkt, nbt, ktbn, tkbn, tknb, nbtk;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragm111,container,false);

        ka = (ImageButton) view.findViewById(R.id.ka);
        ta = (ImageButton) view.findViewById(R.id.ta);
        ba = (ImageButton) view.findViewById(R.id.ba);
        na = (ImageButton) view.findViewById(R.id.na);
        kaka = (ImageButton) view.findViewById(R.id.kaka);
        tata = (ImageButton) view.findViewById(R.id.tata);
        baba = (ImageButton) view.findViewById(R.id.baba);
        nana = (ImageButton) view.findViewById(R.id.nana);
        kakaa = (ImageButton) view.findViewById(R.id.kakaa);
        tataa = (ImageButton) view.findViewById(R.id.tataa);
        babaa = (ImageButton) view.findViewById(R.id.babaa);
        nanaa = (ImageButton) view.findViewById(R.id.nanaa);
        kata = (ImageButton) view.findViewById(R.id.kata);
        taka = (ImageButton) view.findViewById(R.id.taka);
        bana = (ImageButton) view.findViewById(R.id.bana);
        naba = (ImageButton) view.findViewById(R.id.naba);
        kaba = (ImageButton) view.findViewById(R.id.kaba);
        tana = (ImageButton) view.findViewById(R.id.tana);
        baka = (ImageButton) view.findViewById(R.id.baka);
        nata = (ImageButton) view.findViewById(R.id.nata);
        kkk = (ImageButton) view.findViewById(R.id.kakaka);
        ttt = (ImageButton) view.findViewById(R.id.tatata);
        bbb = (ImageButton) view.findViewById(R.id.bababa);
        nnn = (ImageButton) view.findViewById(R.id.nanana);
        ktb = (ImageButton) view.findViewById(R.id.kataba);
        tbn = (ImageButton) view.findViewById(R.id.tabana);
        btk = (ImageButton) view.findViewById(R.id.bataka);
        nkt = (ImageButton) view.findViewById(R.id.nakata);
        kbn = (ImageButton) view.findViewById(R.id.kabana);
        tnk = (ImageButton) view.findViewById(R.id.tanaka);
        bkt = (ImageButton) view.findViewById(R.id.bakata);
        nbt = (ImageButton) view.findViewById(R.id.nabata);
        ktbn = (ImageButton) view.findViewById(R.id.ktbn);
        tkbn = (ImageButton) view.findViewById(R.id.tkbn);
        tknb = (ImageButton) view.findViewById(R.id.tknb);
        nbtk = (ImageButton) view.findViewById(R.id.nbtk);


        ka.setOnClickListener(this);
        ta.setOnClickListener(this);
        ba.setOnClickListener(this);
        na.setOnClickListener(this);
        kaka.setOnClickListener(this);
        tata.setOnClickListener(this);
        baba.setOnClickListener(this);
        nana.setOnClickListener(this);
        kakaa.setOnClickListener(this);
        tataa.setOnClickListener(this);
        babaa.setOnClickListener(this);
        nanaa.setOnClickListener(this);
        kata.setOnClickListener(this);
        taka.setOnClickListener(this);
        bana.setOnClickListener(this);
        naba.setOnClickListener(this);
        kaba.setOnClickListener(this);
        tana.setOnClickListener(this);
        baka.setOnClickListener(this);
        nata.setOnClickListener(this);
        kkk.setOnClickListener(this);
        ttt.setOnClickListener(this);
        bbb.setOnClickListener(this);
        nnn.setOnClickListener(this);
        ktb.setOnClickListener(this);
        tbn.setOnClickListener(this);
        btk.setOnClickListener(this);
        nkt.setOnClickListener(this);
        kbn.setOnClickListener(this);
        tnk.setOnClickListener(this);
        bkt.setOnClickListener(this);
        nbt.setOnClickListener(this);
        ktbn.setOnClickListener(this);
        tkbn.setOnClickListener(this);
        tknb.setOnClickListener(this);
        nbtk.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ka:
                mp = MediaPlayer.create(getActivity(), R.raw.a1111ka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.ta:
                mp = MediaPlayer.create(getActivity(), R.raw.a1112ta);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.ba:
                mp = MediaPlayer.create(getActivity(), R.raw.a1113ba);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.na:
                mp = MediaPlayer.create(getActivity(), R.raw.a1114na);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kaka:
                mp = MediaPlayer.create(getActivity(), R.raw.a1115kaka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tata:
                mp = MediaPlayer.create(getActivity(), R.raw.a1116tata);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.baba:
                mp = MediaPlayer.create(getActivity(), R.raw.a1117baba);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nana:
                mp = MediaPlayer.create(getActivity(), R.raw.a1118nana);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kakaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a1119kaka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tataa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11110tata);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.babaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11111baba);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nanaa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11112nana);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kata:
                mp = MediaPlayer.create(getActivity(), R.raw.a11113kata);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.taka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11114taka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.bana:
                mp = MediaPlayer.create(getActivity(), R.raw.a11115bana);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.naba:
                mp = MediaPlayer.create(getActivity(), R.raw.a11116naba);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kaba:
                mp = MediaPlayer.create(getActivity(), R.raw.a11117kaba);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tana:
                mp = MediaPlayer.create(getActivity(), R.raw.a11118tana);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.baka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11119baka);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nata:
                mp = MediaPlayer.create(getActivity(), R.raw.a11120nata);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kakaka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11121kkk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tatata:
                mp = MediaPlayer.create(getActivity(), R.raw.a11122ttt);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.bababa:
                mp = MediaPlayer.create(getActivity(), R.raw.a11123bbb);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nanana:
                mp = MediaPlayer.create(getActivity(), R.raw.a11124nnn);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kataba:
                mp = MediaPlayer.create(getActivity(), R.raw.a11125ktb);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tabana:
                mp = MediaPlayer.create(getActivity(), R.raw.a11126tbn);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.bataka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11127btk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nakata:
                mp = MediaPlayer.create(getActivity(), R.raw.a11128nkt);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.kabana:
                mp = MediaPlayer.create(getActivity(), R.raw.a11129kbn);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tanaka:
                mp = MediaPlayer.create(getActivity(), R.raw.a11130tnk);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.bakata:
                mp = MediaPlayer.create(getActivity(), R.raw.a11131bkt);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nabata:
                mp = MediaPlayer.create(getActivity(), R.raw.a11132nbt);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.ktbn:
                mp = MediaPlayer.create(getActivity(), R.raw.a11133ktbn);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tkbn:
                mp = MediaPlayer.create(getActivity(), R.raw.a11134tkbn);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.tknb:
                mp = MediaPlayer.create(getActivity(), R.raw.a11135tknb);
                mp.start();
                mp.setLooping(false);
                break;
            case R.id.nbtk:
                mp = MediaPlayer.create(getActivity(), R.raw.a11136nbtk);
                mp.start();
                mp.setLooping(false);
                break;

        }
        /*mp = MediaPlayer.create(getActivity(), R.raw.a1111ka);
        mp.start();
        mp.setLooping(false);*/

    }
}