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
public class PersonalFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama,txtAlamat,txtNohp;




    public PersonalFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanState){
        super.onCreate(savedInstanState);
        bundle=getArguments();
        pegawainya=(Pegawai)bundle.getSerializable("bungkus1");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_personal, container, false);
        txtNama=(TextView)view.findViewById(R.id.txt_namapersonal);
        txtAlamat=(TextView)view.findViewById(R.id.txt_alamat);
        txtNohp=(TextView)view.findViewById(R.id.txt_nohp);
        return view;
    }
    @Override
      public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNama());
        txtAlamat.setText(pegawainya.getAlamat());
        txtNohp.setText(pegawainya.getNoHp());
    }

}
