package com.pekphet.unlessstory.data.dao;

/**
 * Created by Administrator on 2015/10/23.
 */

/**
 *  战斗时数据接口
 */
public interface IWaringData {
    boolean hitMost();
    boolean hitPer();
    boolean isCritical();
    boolean isHeadShot();
    void healPer();
    void healMon();
    void escapePer();
    void finish();
}
