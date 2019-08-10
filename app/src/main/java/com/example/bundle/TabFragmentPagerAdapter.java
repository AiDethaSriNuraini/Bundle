package com.example.bundle;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[] judul = new String[]{"personal", "jobs", "skill"};
    Pegawai objPegawai;

    public TabFragmentPagerAdapter(FragmentManager fm, Pegawai objPegawai) {
        super(fm);
        this.objPegawai = objPegawai;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                Fragment fragmentPersonal = new PersonalFragment();
                Bundle bungkus = new Bundle();
                bungkus.putSerializable("bungkus1", objPegawai);
                fragmentPersonal.setArguments(bungkus);
                return fragmentPersonal;
            case 1:
                Fragment fragmentJobs = new JobFragment();
                Bundle bungkus2 = new Bundle();
                bungkus2.putSerializable("bungkus2", objPegawai);
                fragmentJobs.setArguments(bungkus2);
                return fragmentJobs;
            case 2:
                Fragment fragmentSkill = new SkillFragment();
                Bundle bungkus3 = new Bundle();
                bungkus3.putSerializable("bungkus3", objPegawai);
                fragmentSkill.setArguments(bungkus3);
                return fragmentSkill;
        }
            return null;
        }
       @Override
               public int getCount(){
        return judul.length;
        }
        @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return judul[position];
    }
}