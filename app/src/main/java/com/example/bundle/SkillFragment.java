package com.example.bundle;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SkillFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama,txtasalsekolah,txtkompetensi;



    public SkillFragment() {
        // Required empty public constructor
    }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    bundle=getArguments();
    pegawainya=(Pegawai)bundle.getSerializable("bungkus3");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_skill, container, false);
            txtNama=(TextView)view.findViewById(R.id.txt_namaskill);
            txtasalsekolah=(TextView)view.findViewById(R.id.txt_asalsekolah);
            txtkompetensi = (TextView) view.findViewById(R.id.txt_kompetensi);
            return view;
    }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);
            txtNama.setText(pegawainya.getNama());
            txtasalsekolah.setText(pegawainya.getAsalSekolah());
            txtkompetensi.setText(pegawainya.getKompetensi());
        }

}
