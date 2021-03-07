package com.solution.tabslidingwithclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewpager;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tabLayout=findViewById(R.id.Tab);
    viewpager=findViewById(R.id.viewPAger1);
    viewpager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
 tabLayout.setupWithViewPager(viewpager);
    }
}