package com.z3tecx.a25hadist;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.z3tecx.a25hadist.Fragmentt.EighTeenFragment;
import com.z3tecx.a25hadist.Fragmentt.EightFragment;
import com.z3tecx.a25hadist.Fragmentt.ElevenFragment;
import com.z3tecx.a25hadist.Fragmentt.FiveFragment;
import com.z3tecx.a25hadist.Fragmentt.FiveteenFragment;
import com.z3tecx.a25hadist.Fragmentt.FourFragment;
import com.z3tecx.a25hadist.Fragmentt.FourTeenFragment;
import com.z3tecx.a25hadist.Fragmentt.NineFragment;
import com.z3tecx.a25hadist.Fragmentt.NineTeenFragment;
import com.z3tecx.a25hadist.Fragmentt.OneFragment;
import com.z3tecx.a25hadist.Fragmentt.SevenFragment;
import com.z3tecx.a25hadist.Fragmentt.SeventeenFragment;
import com.z3tecx.a25hadist.Fragmentt.SixFragment;
import com.z3tecx.a25hadist.Fragmentt.SixTeenFragment;
import com.z3tecx.a25hadist.Fragmentt.TenFragment;
import com.z3tecx.a25hadist.Fragmentt.ThirteenFragment;
import com.z3tecx.a25hadist.Fragmentt.ThreeFragment;
import com.z3tecx.a25hadist.Fragmentt.TwelveFragment;
import com.z3tecx.a25hadist.Fragmentt.TwentyFragment;
import com.z3tecx.a25hadist.Fragmentt.TwoFragment;
import com.z3tecx.a25hadist.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading = 3000;

    private TabLayout tabLayout;
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "Hadits 1");
        adapter.addFragment(new TwoFragment(), "Hadits 2");
        adapter.addFragment(new ThreeFragment(), "Hadits 3");
        adapter.addFragment(new FourFragment(), "Hadits 4");
        adapter.addFragment(new FiveFragment(), "Hadits 5");
        adapter.addFragment(new SixFragment(), "Hadits 6");
        adapter.addFragment(new SevenFragment(), "Hadits 7");
        adapter.addFragment(new EightFragment(), "Hadits 8");
        adapter.addFragment(new NineFragment(), "Hadits 9");
        adapter.addFragment(new TenFragment(), "Hadits 10");
        adapter.addFragment(new ElevenFragment(), "Hadits 11");
        adapter.addFragment(new TwelveFragment(), "Hadits 12");
        adapter.addFragment(new ThirteenFragment(), "Hadits 13");
        adapter.addFragment(new FourTeenFragment(), "Hadits 14");
        adapter.addFragment(new FiveteenFragment(), "Hadits 15");
        adapter.addFragment(new SixTeenFragment(), "Hadits 16");
        adapter.addFragment(new SeventeenFragment(), "Hadits 17");
        adapter.addFragment(new EighTeenFragment(), "Hadits 18");
        adapter.addFragment(new NineTeenFragment(), "Hadits 19");
        adapter.addFragment(new TwentyFragment(), "Hadits 20");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }


    }
}