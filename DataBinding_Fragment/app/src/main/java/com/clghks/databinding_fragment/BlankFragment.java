package com.clghks.databinding_fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clghks.databinding_fragment.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {
    private User user;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user = new User("Test", "User", false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentBlankBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false);
        binding.setUser(user);
        return binding.getRoot();
    }
}

