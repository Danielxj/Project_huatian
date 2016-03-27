package com.huatian.administrator.project_huatian;

import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.huatian.administrator.project_huatian.base.BaseActivity;
import com.huatian.administrator.project_huatian.util.Constant;
import com.huatian.administrator.project_huatian.util.L;

/**
 * @描述：
 * @创建人： 杰
 * @创建时间: 2016/3/27 16:14
 * @备注：
 */
public class ParticularsActiaity extends BaseActivity {

    private TextView tv_eye,tv_shoucang,tv_time,tv_xiai;
    private WebView webView;
    private String url;

    @Override
    protected int getContentResid() {
        return R.layout.particulars_layout;
    }

    @Override
    protected void init() {
/*        tv_eye = (TextView) findViewById(R.id.tv_eye);
        tv_shoucang = (TextView) findViewById(R.id.tv_shoucang);
        tv_time = (TextView) findViewById(R.id.tv_time);
        tv_eye = (TextView) findViewById(R.id.tv_eye);*/
        webView = (WebView) findViewById(R.id.web_particulars);


    }

    private void loadweb() {
        webView.loadUrl(url);
        // 覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                // 返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        this.url = intent.getStringExtra(Constant.KEYS.INTENT_PARTICULARS);
        L.e(url+"                  传过来的网址");
        loadweb();
    }

    public void back(View view){
        finish();
    }
}
