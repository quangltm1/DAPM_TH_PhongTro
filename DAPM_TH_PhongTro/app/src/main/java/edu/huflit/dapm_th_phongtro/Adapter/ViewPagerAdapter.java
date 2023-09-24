package edu.huflit.dapm_th_phongtro.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import edu.huflit.dapm_th_phongtro.UI.Home.HomeFragment;
import edu.huflit.dapm_th_phongtro.UI.QuanLy.ManageFragment;
import edu.huflit.dapm_th_phongtro.UI.ThuChi.ThuChiFragment;
import edu.huflit.dapm_th_phongtro.UI.ToaNha.BuildingFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position)
            {
                case 0:
                    return new HomeFragment();
                case 1:
                    return new BuildingFragment();
                case 2:
                    return new ThuChiFragment();
                case 3:
                    return new ManageFragment();
                default:
                    return new HomeFragment();

            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
