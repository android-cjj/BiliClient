package com.cjj.bb.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cjj.bb.R;

/**
 * Created by Administrator on 2015/5/26.
 */
public class FragmentLogin extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ImageView iv = new ImageView(getActivity());
        iv.setImageResource(R.drawable.login);
        return  iv;
    }
}
