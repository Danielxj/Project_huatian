package com.huatian.administrator.project_huatian.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.huatian.administrator.project_huatian.Bean.HomeData;
import com.huatian.administrator.project_huatian.R;
import com.huatian.administrator.project_huatian.base.BaseFragment;
import com.huatian.administrator.project_huatian.util.Constant;

/**
 * Created by Ken on 2016/3/9.
 * 头部viewpager中的fragment
 */
public class HomeHeadFragment extends BaseFragment {

    private SimpleDraweeView iv;
    private TextView tv;

    /**
     * 静态工厂方法
     * @param dataEntity
     * @return
     */
    public static HomeHeadFragment newInstance(HomeData.ResultEntity dataEntity){
        HomeHeadFragment homeHeadFragment = new HomeHeadFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constant.KEYS.HEAD_DATA, dataEntity);
        homeHeadFragment.setArguments(bundle);
        return homeHeadFragment;
    }

    @Override
    protected int getContentResid() {
        return R.layout.fragment_headviewpager;
    }

    @Override
    protected void init(View view) {
        iv = (SimpleDraweeView) view.findViewById(R.id.civ_head);
        tv = (TextView) view.findViewById(R.id.tv_head);
    }


    @Override
    protected void getData(Bundle bundle) {
        final HomeData.ResultEntity dataEntity  = (HomeData.ResultEntity) bundle.getSerializable(Constant.KEYS.HEAD_DATA);

        iv.setImageURI(Uri.parse(dataEntity.getSmallIcon()));

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"dataEntity.getSmallIcon()",Toast.LENGTH_SHORT).show();
            }
        });
        tv.setText(dataEntity.getTitle());
    }

}
