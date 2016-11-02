package com.huihui.databingding;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huihui.MyFragmentBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        MyFragmentBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false);


        mBinding.setStu(new Student(new ObservableField<String>("裴银辉"), new ObservableInt(27)));

        mBinding.btnNext.setOnClickListener(this);

        return mBinding.getRoot();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnNext) {


            startActivity(new Intent(getContext(), HomeActivity.class));
        }
    }
}
