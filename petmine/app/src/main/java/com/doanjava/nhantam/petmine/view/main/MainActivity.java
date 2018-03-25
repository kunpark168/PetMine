package com.doanjava.nhantam.petmine.view.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.doanjava.nhantam.petmine.R;

public class MainActivity extends AppCompatActivity {

    private AHBottomNavigation bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setUpBottomNavigation ();
    }


}
