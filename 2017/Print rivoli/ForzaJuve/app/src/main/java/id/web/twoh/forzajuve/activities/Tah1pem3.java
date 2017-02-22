package id.web.twoh.forzajuve.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import id.web.twoh.forzajuve.R;
import id.web.twoh.forzajuve.fragments.Fragm131;
import id.web.twoh.forzajuve.fragments.Fragm132;
import id.web.twoh.forzajuve.fragments.Fragm133;
import id.web.twoh.forzajuve.fragments.Fragm134;
import id.web.twoh.forzajuve.fragments.Fragm135;
import id.web.twoh.forzajuve.fragments.Fragm136;
import id.web.twoh.forzajuve.fragments.Fragm137;

/**
 * Created by Seven on 14-Dec-16.
 */

public class Tah1pem3 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tah1pem3);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });
    }

    private class CustomAdapter extends FragmentPagerAdapter {
        private String fragments[] = {"1","2","3","4","5","6","7"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Fragm131();
                case 1:
                    return new Fragm132();
                case 2:
                    return new Fragm133();
                case 3:
                    return new Fragm134();
                case 4:
                    return new Fragm135();
                case 5:
                    return new Fragm136();
                case 6:
                    return new Fragm137();
                default:
                    return null;
            }
        }
        @Override
        public int getCount(){
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position){
            return fragments[position];
        }
    }
}