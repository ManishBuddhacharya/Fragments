package com.softwarica.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.FirstFragment;
import fragments.SecondFragment;
import fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnFragment;
    private boolean status= true, sec_status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment = findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnFragment.setText("Load Second Fragment");
            status = false;
        }
        else {
            if (sec_status) {
                SecondFragment secondFragment = new SecondFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, secondFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                btnFragment.setText("Load Third Fragment");
                status = true;
                sec_status = false;
            }
            else {
                ThirdFragment thirdFragment = new ThirdFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, thirdFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                btnFragment.setText("Load First Fragment");
                status = true;
                sec_status = true;
            }
        }
    }
}
