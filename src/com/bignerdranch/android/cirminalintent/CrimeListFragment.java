package com.bignerdranch.android.cirminalintent;

import android.app.ListFragment;
import android.os.Bundle;
import com.bignerdranch.android.cirminalintent.model.Crime;
import com.bignerdranch.android.cirminalintent.model.CrimeLab;

import java.util.ArrayList;

/**
 * Created by Ray on 2016/2/24.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crime_title);

        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}
