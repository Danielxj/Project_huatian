package com.huatian.administrator.project_huatian.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.huatian.administrator.project_huatian.Bean.HomeData;
import com.huatian.administrator.project_huatian.R;
import com.huatian.administrator.project_huatian.base.BaseFragment;
import com.huatian.administrator.project_huatian.util.Constant;
import com.huatian.administrator.project_huatian.util.VolleyUtil;
import com.huatian.administrator.project_huatian.widget.HomeHeadView;

import java.util.ArrayList;
import java.util.List;

/**
 * @类描述: ${TODO}
 * @创建时间：2016/3/26 16:57
 * @备注：
 */
public class Home_Fragment extends BaseFragment implements VolleyUtil.OnRequestListener {
    private ListView mLv;
    private ViewPager headVp;
    private List<HomeData.ResultEntity> jianshang;
    private List<HomeData.ResultEntity> miji;
    private List<HomeData.ResultEntity> tingyuan;
    private List<HomeData.ResultEntity> weiguan;
    private List<HomeData.ResultEntity> xiaowu;
    private FrameLayout fl_home;
    private List<HomeData.ResultEntity> headDatas;
    private HomeHeadView homeHeadView;

    public static Home_Fragment newInstance() {

        Bundle args = new Bundle();

        Home_Fragment fragment = new Home_Fragment();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getContentResid() {
        VolleyUtil.initVolley(getActivity());
        return R.layout.home_fragment;
    }

    @Override
    protected void init(View view) {
      //  fl_home = (FrameLayout) view.findViewById(R.id.fl_home);
        homeHeadView = new HomeHeadView(getActivity(), getChildFragmentManager());
       // fl_home.addView(homeHeadView);
        headDatas=new ArrayList<>();
    }

    /**
     * 下载json数据
     */
    @Override
    protected void loadData() {
        VolleyUtil.requestString(Constant.URL.JIANSHANAG, this);
        VolleyUtil.requestString(Constant.URL.MIJI, this);
        VolleyUtil.requestString(Constant.URL.TINGYUAN, this);
        VolleyUtil.requestString(Constant.URL.WEIGUAN, this);
        VolleyUtil.requestString(Constant.URL.XIAOWU, this);
    }

    /**
     * 下载json数据成功的回掉
     *
     * @param url
     * @param response
     */
    @Override
    public void onResponse(String url, String response) {
        switch (url) {
            //跨界鉴赏
            case Constant.URL.JIANSHANAG:
                jianshang = jsonUtil( response);
                headDatas.add(jianshang.get(3));
                if(headDatas.size()==5){
                    homeHeadView.setdata(headDatas);
                }
                break;
            //花田秘籍
            case Constant.URL.MIJI:
                miji = jsonUtil(response);
                headDatas.add(miji.get(3));
                if(headDatas.size()==5){
                    homeHeadView.setdata(headDatas);
                }
                break;
            //家庭庭院
            case Constant.URL.TINGYUAN:
                tingyuan = jsonUtil(response);
                headDatas.add(tingyuan.get(3));
                if(headDatas.size()==5){
                    homeHeadView.setdata(headDatas);
                }
                break;
            //城市微光
            case Constant.URL.WEIGUAN:
                weiguan = jsonUtil(response);
                headDatas.add(weiguan.get(3));
                if(headDatas.size()==5){
                    homeHeadView.setdata(headDatas);
                }
                break;
            //缤纷小物
            case Constant.URL.XIAOWU:
                xiaowu = jsonUtil(response);
                headDatas.add(xiaowu.get(3));
                if(headDatas.size()==5){
                    homeHeadView.setdata(headDatas);
                }
                break;
        }

    }

    /**
     * json解析方法
     * @param response
     */
    private List<HomeData.ResultEntity> jsonUtil(String response) {
        HomeData homeData = new Gson().fromJson(response, HomeData.class);
        return homeData.getResult();
    }

    /**
     * 下载json数据失败的回掉
     *
     * @param url
     * @param error
     */
    @Override
    public void onErrorResponse(String url, VolleyError error) {

    }
}
