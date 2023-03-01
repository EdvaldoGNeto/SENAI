package com.example.aprendaingles.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BichosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BichosFragment extends Fragment implements View.OnClickListener {
    private ImageView Cao, Gato, Leao, Macaco, Oveia, Vaca;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BichosFragment() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BichosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BichosFragment newInstance(String param1, String param2) {
        BichosFragment fragment = new BichosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);
        Cao = view.findViewById(R.id.Cao);
        Gato = view.findViewById(R.id.Gato);
        Leao = view.findViewById(R.id.Leao);
        Macaco = view.findViewById(R.id.Macaco);
        Oveia = view.findViewById(R.id.Oveia);
        Vaca = view.findViewById(R.id.Vaca);

        Cao.setOnClickListener(this);
        Gato.setOnClickListener(this);
        Leao.setOnClickListener(this);
        Macaco.setOnClickListener(this);
        Oveia.setOnClickListener(this);
        Vaca.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Cao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                executarSom();
                break;
            case R.id.Gato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                executarSom();
                break;
            case R.id.Leao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                executarSom();
                break;
            case R.id.Macaco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                executarSom();
                break;
            case R.id.Oveia:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                executarSom();
                break;
            case R.id.Vaca:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                executarSom();
                break;

        }
    }

    public void executarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }else{
            mediaPlayer.stop();
            mediaPlayer.start();
        }
    }

}