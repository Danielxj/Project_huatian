package com.huatian.administrator.project_huatian.widget;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.huatian.administrator.project_huatian.Bean.HomeData;
import com.huatian.administrator.project_huatian.R;
import com.huatian.administrator.project_huatian.fragment.HomeHeadFragment;

import java.util.List;

/**
 * Created by Ken on 2016/3/9.
 * 首页头部的广告栏组合控件
 */
public class HomeHeadView extends FrameLayout {

    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private FragmentManager fragmentManager;
    private Context context;
    private List<HomeData.ResultEntity> datas;

    private NavView navView;

    public HomeHeadView(Context context, FragmentManager fragmentManager) {
        super(context);
        this.context = context;
        this.fragmentManager = fragmentManager;
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.custem_headview, this, true);
        viewPager = (ViewPager) this.findViewById(R.id.vp_head);
        navView = (NavView) findViewById(R.id.nv);
    }


    public void setdata(List<HomeData.ResultEntity> data) {
        this.datas = data;
        viewPagerAdapter = new ViewPagerAdapter(fragmentManager,datas);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"我被点击了",Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * 设置导航控件的个数
         */
        navView.setCount(datas.size());
        navView.setViewPager(viewPager);
    }


    /**
     * FragmentPagerAdapter:不会完全销毁Fragment的对象，会将fragment的对象缓存起来，以便于下次使用
     * 一般在viewpager中item较少，并且不会出现频繁刷新的情况
     * <p>
     * FragmentStatePagerAdapter：会将fragment完成移除，下次会生成新的fragment
     */
    class ViewPagerAdapter extends FragmentStatePagerAdapter {
        List<HomeData.ResultEntity> datas;

        public ViewPagerAdapter(FragmentManager fm, List<HomeData.ResultEntity> datas) {
            super(fm);
            this.datas = datas;
        }

        @Override
        public Fragment getItem(int position) {
            HomeHeadFragment fragment = HomeHeadFragment.newInstance(datas.get(position));
            Log.e("tag", "--------------------------------------");
            return fragment;
        }

        @Override
        public int getCount() {
            return datas.size();
        }
    }
}
