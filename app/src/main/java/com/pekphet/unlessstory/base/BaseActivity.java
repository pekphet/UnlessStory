package com.pekphet.unlessstory.base;

import android.app.Activity;
import android.os.Bundle;

import com.pekphet.unlessstory.annotation.LoadAnnotation;
import com.pekphet.unlessstory.app.AppEnv;

/**
 * Created by Administrator on 2015/10/23.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppEnv.setActivity(this);
        LoadAnnotation.getInstance().Load();
    }
}
