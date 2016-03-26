package com.huatian.administrator.project_huatian;

import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.huatian.administrator.project_huatian.base.BaseActivity;

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

        fragmentList=new ArrayList<>();


        mRg = (RadioGroup) findViewById(R.id.rg_tab);
        mRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_tab_home:
                        break;
                    case R.id.rb_tab_discover:
                        break;
                    case R.id.rb_tab_personal:
                        break;
                }
            }
        });

        mRg.getChildAt(0).performClick();

    }
}
