package com.dheeyi.onboardingappt.Onboarding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dheeyi.onboardingappt.R;

/**
 * A WelcomeFragment {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {
    private ViewPager viewPager;
    private View view;
    private TextView tvNext;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initializeInflater(inflater, container);
        initializeComponents();
        eventClickNext();
        return view;
    }

    /**
     * @param {LayoutInflater} inflater
     * @param {ViewGroup}      container
     * @name initializeInflater
     */
    private void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    /**
     * @name initializeComponents
     */
    private void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        tvNext = view.findViewById(R.id.tvNextWelcome);
    }

    /**
     * @name eventClickNext
     */
    private void eventClickNext() {
        tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
}
