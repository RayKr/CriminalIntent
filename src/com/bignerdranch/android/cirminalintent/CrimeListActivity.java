package com.bignerdranch.android.cirminalintent;

import android.app.Fragment;

/**
 * Created by Ray on 2016/2/24.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }


}
