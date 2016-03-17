package com.example.clc.criminalintent1;

import android.support.v4.app.Fragment;

/**
 * Created by clc on 2016/3/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
