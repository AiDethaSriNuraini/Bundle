package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DetailActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    Pegawai pegawaiDetail;
    TabFragmentPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        Intent intent = getIntent();
        pegawaiDetail = (Pegawai) intent.getSerializableExtra("pegawainya");
        pagerAdapter=new TabFragmentPagerAdapter(getSupportFragmentManager(),pegawaiDetail);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorWhite),getResources().getColor(R.color.colorAccent));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
