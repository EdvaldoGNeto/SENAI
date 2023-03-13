package com.example.navigation.ui.Fragments;

import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.navigation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mediaPlayerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mediaPlayerFragment extends Fragment implements View.OnClickListener{
    private MediaPlayer mediaPlayer;
    private ImageView play, pause, stop;
    private AudioManager audioManager;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public mediaPlayerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mediaPlayerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static mediaPlayerFragment newInstance(String param1, String param2) {
        mediaPlayerFragment fragment = new mediaPlayerFragment();
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
        View view = inflater.inflate(R.layout.fragment_media_player, container, false);
        play = view.findViewById(R.id.play);
        pause = view.findViewById(R.id.pause);
        stop = view.findViewById(R.id.stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                if (mediaPlayer != null){
                    mediaPlayer.start();
                }else{
                    mediaPlayer = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.music);
                    mediaPlayer.start();
                }
                break;
            case R.id.pause:
                mediaPlayer.pause();
                break;
            case R.id.stop:
                if (mediaPlayer != null){
                    mediaPlayer.stop();
                    mediaPlayer = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.music);
                }else {
                    mediaPlayer.stop();
                    mediaPlayer = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.music);
                }

                break;
        }
    }

}