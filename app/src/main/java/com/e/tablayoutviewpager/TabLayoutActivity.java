package com.e.tablayoutviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.tablayoutviewpager.mFragments.Fragment1;
import com.e.tablayoutviewpager.mFragments.MyPagerAdapter;

public class TabLayoutActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);


        viewPager = (ViewPager) findViewById(R.id.mViewpager_ID);
        this.addPages();
        tabLayout = (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(this.getSupportFragmentManager());

        for(int i=0; i<=9; i++){
            pagerAdapter.addFragment(new Fragment1());
        }

        viewPager.setAdapter(pagerAdapter);
    }

    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }



    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }
    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void TestUpload(){
        int i = 1+1;
    }
}
