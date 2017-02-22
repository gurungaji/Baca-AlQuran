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
import id.web.twoh.forzajuve.fragments.Fragm121;
import id.web.twoh.forzajuve.fragments.Fragm122;
import id.web.twoh.forzajuve.fragments.Fragm123;
import id.web.twoh.forzajuve.fragments.Fragm124;
import id.web.twoh.forzajuve.fragments.Fragm125;
import id.web.twoh.forzajuve.fragments.Fragm126;
import id.web.twoh.forzajuve.fragments.Fragm127;

/**
 * Created by Seven on 14-Dec-16.
 */

public class Tah1pem2 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tah1pem2);

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
                    return new Fragm121();
                case 1:
                    return new Fragm122();
                case 2:
                    return new Fragm123();
                case 3:
                    return new Fragm124();
                case 4:
                    return new Fragm125();
                case 5:
                    return new Fragm126();
                case 6:
                    return new Fragm127();
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