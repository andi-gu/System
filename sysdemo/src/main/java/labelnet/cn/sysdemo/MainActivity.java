package labelnet.cn.sysdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import labelnet.cn.sysdemo.adapter.MainViewPagerAdapter;
import labelnet.cn.sysdemo.fragments.CPUFragment;
import labelnet.cn.sysdemo.fragments.ProcessFrargment;
import labelnet.cn.sysdemo.fragments.ZramFragment;

public class MainActivity extends AppCompatActivity {

    private List<String> titles;
    private List<Fragment> fragments;
    private MainViewPagerAdapter adapter;

    private TabLayout tabLayout;
    private ViewPager viewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initView() {
        tabLayout = (TabLayout) findViewById(R.id.main_tabs);
        viewPage = (ViewPager) findViewById(R.id.main_viewPager);
        viewPage.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPage);
    }

    private void initData() {
        titles = new ArrayList<>();
        titles.add("CPU");
        titles.add("Process");
        titles.add("ZARM");

        fragments = new ArrayList<>();
        fragments.add(CPUFragment.getInstance());
        fragments.add(ProcessFrargment.getInstance());
        fragments.add(ZramFragment.getInstance());

        adapter = new MainViewPagerAdapter(getSupportFragmentManager(), titles, fragments);
    }
}
