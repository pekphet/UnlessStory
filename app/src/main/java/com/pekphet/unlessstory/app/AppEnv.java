package com.pekphet.unlessstory.app;

import com.pekphet.unlessstory.base.BaseActivity;

/**
 * Created by Administrator on 2015/10/23.
 */
public class AppEnv {
    private static BaseActivity mActivity = null;

    public static void setActivity(BaseActivity activity) {
        mActivity = activity;
    }
    public static BaseActivity getActivity() {
        return mActivity;
    }
}
