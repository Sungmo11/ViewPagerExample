package com.witi.viewpagerexample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.witi.viewpagerexample.R;

public class FragWednesday extends Fragment {

    private View view;

    // 상태 저장을 위함
    // 어댑터와 통신하기 위함
    public static FragWednesday newInstance(){
        FragWednesday fragWednesday = new FragWednesday();
        return fragWednesday;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_wednesday, container, false);
        return view;
    }

}
