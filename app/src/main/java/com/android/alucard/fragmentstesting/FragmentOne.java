package com.android.alucard.fragmentstesting;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentOne extends Fragment {
    private static final String TAG = "FragmentOne";

    Button btSend;
    EditText etUser, etPass;

    MyInterface myInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myInterface = (MyInterface) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);

        btSend = v.findViewById(R.id.btSend);
        etUser = v.findViewById(R.id.etUser);
        etPass = v.findViewById(R.id.etPassword);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUser.getText().toString();
                Log.d(TAG, "onClick: username: " + user);
                String pass = etPass.getText().toString();
                Log.d(TAG, "onClick: pass: " + pass);
                myInterface.sendMessage(user, pass);
            }
        });

        return v;
    }
}
