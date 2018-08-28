package com.android.alucard.fragmentstesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendMessage(String user, String pass) {

            FragmentTwo fragmentTwo = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragmentBot);
            fragmentTwo.getMessage(user, pass);



    }

    private void gitMethod() {
        int i = 1 + 2;
    }
}
