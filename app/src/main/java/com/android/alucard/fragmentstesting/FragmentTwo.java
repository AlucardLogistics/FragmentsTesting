package com.android.alucard.fragmentstesting;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    TextView tvUser, tvPass;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_two, container, false);

        tvUser = v.findViewById(R.id.tvUser);
        tvPass = v.findViewById(R.id.tvPass);


        return v;
    }

    public void getMessage(String user, String pass) {
        tvUser.setText(user);
        tvPass.setText(pass);
    }
}
