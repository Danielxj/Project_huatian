package com.huatian.administrator.project_huatian.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.huatian.administrator.project_huatian.R;

/**
 * Created by Ken on 2016/3/9.
 * 配合viewpager的导航控件
 */
public class NavView extends FrameLayout implements ViewPager.OnPageChangeListener {

    private LinearLayout checkedLL, uncheckedLL;
    private int checkedImg, uncheckedImg;
    private int count;

    private ImageView iv;

    public NavView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paresAttr(attrs);
        init();
    }

    /**
     * 解析自定义属性
     * @param attrs
     */
    private void paresAttr(AttributeSet attrs) {
        TypedArray typedArray = getResources().obtainAttributes(attrs, R.styleable.navview);
        checkedImg = typedArray.getResourceId(R.styleable.navview_checkedimg, 0);
        uncheckedImg = typedArray.getResourceId(R.styleable.navview_uncheckedimg, 0);
        typedArray.recycle();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.custem_nav, this, true);
        checkedLL = (LinearLayout) findViewById(R.id.ll_checked);
        uncheckedLL = (LinearLayout) findViewById(R.id.ll_unchecked);
    }

    /**
     * 设置控件需要显示几个图标
     * @param count
     */
    public void setCount(int count){
        checkedLL.removeAllViews();
        uncheckedLL.removeAllViews();
        this.count = count;
        initView();
    }

    /**
     * 初始化控件的显示内容
     */
    private void initView() {
        if(count > 0 && checkedImg != 0 && uncheckedImg != 0) {
            for (int i = 0; i < count; i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ImageView univ = new ImageView(getContext());
                univ.setImageResource(uncheckedImg);
                univ.setPadding(2, 2, 2, 2);
                univ.setLayoutParams(layoutParams);
                uncheckedLL.addView(univ);
            }

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            iv = new ImageView(getContext());
            iv.setImageResource(checkedImg);
            iv.setPadding(2, 2, 2, 2);
                    ;
            iv.setLayoutParams(layoutParams);
            checkedLL.addView(iv);
        }
    }

    /**
     * 设置与该导航控件联动的ViewPager
     * @param viewPager
     */
    public void setViewPager(ViewPager viewPager){
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        setMoveSize(position, positionOffset);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * 设置导航的效果
     */
    public void setMoveSize(int position,  float positionOffset){
        if(iv != null){
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv.getLayoutParams();
            layoutParams.leftMargin = (int) (iv.getWidth() * (position + positionOffset));
            iv.setLayoutParams(layoutParams);
        }
    }
}
