package com.yiran.hanfuquan.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yiran.hanfuquan.R;
import com.yiran.hanfuquan.view.activity.MainActivity;

import nucleus.view.NucleusFragment;


/**
 * Created by yiran on 2017/8/28.
 * 活动页面
 */

public class AtyFragment extends NucleusFragment{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_aty, container, false);
        ((View)((MainActivity)getActivity()).getToolbar().getParent()).setElevation(0);  // 设置toolbar的阴影为0
        return view;
    }
}
