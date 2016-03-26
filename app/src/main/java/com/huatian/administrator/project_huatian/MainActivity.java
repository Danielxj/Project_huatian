package com.huatian.administrator.project_huatian;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.RadioGroup;

import com.huatian.administrator.project_huatian.base.BaseActivity;
import com.huatian.administrator.project_huatian.fragment.Discover_Fragment;
import com.huatian.administrator.project_huatian.fragment.Home_Fragment;
import com.huatian.administrator.project_huatian.fragment.Personal_Fragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RadioGroup mRg;
    private List<Fragment> fragmentList;

    @Override
    protected int getContentResid() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

        fragmentList = new ArrayList<>();
        fragmentList.add(Home_Fragment.newInstance());
        fragmentList.add(Discover_Fragment.newInstance());
        fragmentList.add(Personal_Fragment.newInstance());


        mRg = (RadioGroup) findViewById(R.id.rg_tab);
        /**
         *给RadioGroup监听
         */
        mRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager manager = getSupportFragmentManager();
                switch (checkedId) {
                    case R.id.rb_tab_home:
                        /**
                         * 判断fragment是否已经添加 若添加隐藏其他fragment
                         * 如果已经添加隐藏其他fragment显示当前选中的fragment
                         * 反之同理
                         */
                        if (fragmentList.get(0).isAdded()) {
                                manager.beginTransaction()
                                        .hide(fragmentList.get(1))
                                        .hide(fragmentList.get(2))
                                        .show(fragmentList.get(0))
                                        .commit();

                        } else {
                            manager.beginTransaction().hide(fragmentList.get(1))
                                    .hide(fragmentList.get(2))
                                    .add(R.id.fl, fragmentList.get(0)).commit();
                        }
                        break;
                    case R.id.rb_tab_discover:
                        if (fragmentList.get(1).isAdded()) {
                                manager.beginTransaction()
                                        .hide(fragmentList.get(0))
                                        .hide(fragmentList.get(2))
                                        .show(fragmentList.get(1))
                                        .commit();

                        } else {
                            manager.beginTransaction()
                                    .hide(fragmentList.get(0))
                                    .hide(fragmentList.get(2))
                                    .add(R.id.fl, fragmentList.get(1)).commit();
                        }
                        break;
                    case R.id.rb_tab_personal:
                        if (fragmentList.get(2).isAdded()) {
                                manager.beginTransaction()
                                        .hide(fragmentList.get(0))
                                        .hide(fragmentList.get(1))
                                        .show(fragmentList.get(2))
                                        .commit();

                        } else {
                            manager.beginTransaction()
                                    .hide(fragmentList.get(0))
                                    .hide(fragmentList.get(1)).
                                    add(R.id.fl, fragmentList.get(2))
                                    .commit();
                        }
                        break;
                }
            }
        });

        /**
         * 模拟点击RadioGroup的第一个条目
         */
        mRg.getChildAt(0).performClick();

    }
}
