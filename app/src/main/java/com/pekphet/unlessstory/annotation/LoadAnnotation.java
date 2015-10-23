package com.pekphet.unlessstory.annotation;

/**
 * Created by Administrator on 2015/10/23.
 */
public class LoadAnnotation {
    private static LoadAnnotation instance = null;

    private LoadAnnotation() {
    }

    public static LoadAnnotation getInstance(){
        if (instance == null) {
            instance = new LoadAnnotation();
        }
        return instance;
    }

    public void Load(){

    }
}
