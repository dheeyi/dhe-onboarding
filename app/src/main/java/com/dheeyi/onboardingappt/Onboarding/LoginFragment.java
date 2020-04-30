package com.dheeyi.onboardingappt.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dheeyi.onboardingappt.App.App;
import com.dheeyi.onboardingappt.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {
    private ViewPager viewPager;
    private View view;
    private TextView tvPrev;
    private Button btLogin, btRegister;
    private EditText etUsername, etPass;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initializeInflater(inflater, container);
        initializeComponents();
        return view;
    }

    private void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    private void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        tvPrev = view.findViewById(R.id.tvPrevLogin);
        tvPrev.setOnClickListener(this);
        etUsername = view.findViewById(R.id.etUsername);
        etPass = view.findViewById(R.id.etPassword);
        btLogin = view.findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        btRegister = view.findViewById(R.id.btRegister);
        btRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvPrevLogin:
                viewPager.setCurrentItem(2);
                break;
            case R.id.btLogin:
                login(etUsername.getText().toString().trim(), etPass.getText().toString().trim());
                break;
            case R.id.btRegister:
                showMsg("Developing!!!");
                break;
        }
    }

    /**
     * @param {String} username
     * @param {String} password
     * @name login
     * @desc login activity
     */
    private void login(String username, String password) {
        if (checkValues(username, password)) {
            Intent intent = new Intent(getActivity(), App.class);
            intent.putExtra("USERNAME", username);
            intent.putExtra("PASSWORD", password);
            startActivity(intent);
            getActivity().finish();
        } else {
            showMsg("Please add username/password");
        }
    }

    /**
     * @param {String} username
     * @param {String} password
     * @return {boolean}
     * @name checkValues
     * @desc check username and password values
     */
    private boolean checkValues(String username, String password) {
        return !(username.equals("") || password.equals(""));
    }

    /**
     * @param {String} msg
     * @name showMsg
     * @desc show toast message
     */
    private void showMsg(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
