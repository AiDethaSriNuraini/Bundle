package com.example.bundle;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JobFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama,txtPekerjaan,txtLamaKerja;


    public JobFragment() {
        // Required empty public constructor
    }
    @Override
    public void  onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        bundle=getArguments();
        pegawainya=(Pegawai)bundle.getSerializable("bungkus2");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_job, container, false);
        txtNama=(TextView)view.findViewById(R.id.txtView2);
        txtPekerjaan=(TextView)view.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja=(TextView)view.findViewById(R.id.txt_lamaKerja);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNama());
        txtPekerjaan.setText(pegawainya.getPekerjaan());
        txtLamaKerja.setText(pegawainya.getLamaKerja());
    }

}
