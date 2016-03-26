package com.huatian.administrator.project_huatian.fragment;

import android.os.Bundle;

import com.huatian.administrator.project_huatian.base.BaseFragment;

/**
 * @类描述: ${TODO}
 * @创建时间：2016/3/26 16:57
 * @备注：
 */
public class Personal_Fragment extends BaseFragment {

    public static Personal_Fragment newInstance() {
        
        Bundle args = new Bundle();
        Personal_Fragment fragment = new Personal_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int getContentResid() {
        return 0;
    }
}
