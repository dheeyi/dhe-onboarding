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
 * A FaceDetectionFragment {@link Fragment} subclass.
 */
public class FaceDetectionFragment extends Fragment {
    private View view;
    private TextView tvPrev, tvEnd;
    private ViewPager viewPager;

    public FaceDetectionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initializeInflater(inflater, container);
        initializeComponents();
        eventClickPrevAndNext();
        return view;
    }

    /**
     * @param {LayoutInflater} inflater
     * @param {ViewGroup}      container
     * @name initializeInflater
     */
    private void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_face_detection, container, false);
    }

    /**
     * @name initializeComponents
     */
    private void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        tvPrev = view.findViewById(R.id.tvPrevFaceDetec);
        tvEnd = view.findViewById(R.id.tvEndFaceDetec);
    }

    /**
     * @name eventClickPrevAndNext
     */
    private void eventClickPrevAndNext() {
        tvPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        tvEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });
    }
}
