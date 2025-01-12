package mcxtzhang.swipedelmenu.viewpager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import mcxtzhang.listswipemenudemo.R;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return FullDemoFragment.newInstance(position);
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }
}
