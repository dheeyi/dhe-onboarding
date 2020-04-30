package com.dheeyi.onboardingappt.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dheeyi.onboardingappt.Onboarding.FaceDetectionFragment;
import com.dheeyi.onboardingappt.Onboarding.LoginFragment;
import com.dheeyi.onboardingappt.Onboarding.TextRecognitionFragment;
import com.dheeyi.onboardingappt.Onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter {

    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new TextRecognitionFragment();
            case 2:
                return new FaceDetectionFragment();
            case 3:
                return new LoginFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
