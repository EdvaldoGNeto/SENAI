package com.example.navigation.ui.slideshow;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation.R;
import com.example.navigation.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment implements View.OnClickListener {
    private Button button3;

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
        button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button3:
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Cupid Carries a Gun");
                builder.setMessage("Você não pode esquecer oque nunca soube.");
                builder.setIcon(R.drawable.ic_baseline_local_fire_department_24);
                builder.setPositiveButton("Concordo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "É isto", Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("Discordo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Então tá bom", Toast.LENGTH_LONG).show();
                    }
                });

                builder.create();
                builder.show();
                break;
        }

    }
}