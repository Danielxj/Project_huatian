package com.huatian.administrator.project_huatian.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ListView;

import com.huatian.administrator.project_huatian.R;
import com.huatian.administrator.project_huatian.base.BaseFragment;

/**
 * @类描述: ${TODO}
 * @创建时间：2016/3/26 16:57
 * @备注：
 */
public class Home_Fragment extends BaseFragment {
    private ListView mLv;
    private ViewPager headVp;

    public static Home_Fragment newInstance() {
        
        Bundle args = new Bundle();
        
        Home_Fragment fragment = new Home_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int getContentResid() {
        return R.layout.home_fragment;
    }

    @Override
    protected void init(View view) {
        View handview = getActivity().getLayoutInflater().inflate(R.layout.home_head_fragment, null);
        mLv = (ListView)view.findViewById(R.id.lv_home);
        headVp= (ViewPager) handview.findViewById(R.id.home_head_vp);

    }
}
