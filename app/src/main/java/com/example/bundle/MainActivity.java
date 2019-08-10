package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNama,edtAlamat,edtNoHp,edtPekerjaan,edtLamaKerja,edtAsalSekolah,edtKompetensi;
    Button btnInput;
    Pegawai pegawai;
    String namanya,alamatnya,noHpnya,pekerjaannya,lamakerjanya,asalSekolahnya,kompetensinya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama=(EditText)findViewById(R.id.edt_nama);
        edtAlamat=(EditText)findViewById(R.id.edt_alamat);
        edtNoHp=(EditText)findViewById(R.id.edt_nohp);
        edtPekerjaan=(EditText)findViewById(R.id.edt_pekerjaan);
        edtLamaKerja=(EditText)findViewById(R.id.edt_lamakerja);
        edtAsalSekolah=(EditText)findViewById(R.id.edt_asalsekolah);
        edtKompetensi=(EditText)findViewById(R.id.edt_kompetensi);
        btnInput=(Button)findViewById(R.id.btn_input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namanya=edtNama.getText().toString();
                alamatnya=edtAlamat.getText().toString();
                noHpnya=edtNoHp.getText().toString();
                pekerjaannya=edtPekerjaan.getText().toString();
                lamakerjanya=edtLamaKerja.getText().toString();
                asalSekolahnya=edtAsalSekolah.getText().toString();
                kompetensinya=edtKompetensi.getText().toString();
                pegawai = new Pegawai(namanya,alamatnya,noHpnya,pekerjaannya,lamakerjanya,asalSekolahnya,kompetensinya);
                Intent pindah = new Intent(MainActivity.this,DetailActivity.class);
                pindah.putExtra("pegawainya",pegawai);
                startActivity(pindah);
            }
        });
    }
}
