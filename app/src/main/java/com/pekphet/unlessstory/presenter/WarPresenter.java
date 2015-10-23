package com.pekphet.unlessstory.presenter;

/**
 * Created by Administrator on 2015/10/23.
 */

import com.pekphet.unlessstory.data.dao.IWaringData;
import com.pekphet.unlessstory.view.inter.IWarView;

import java.util.Observable;
import java.util.Observer;

/**
 * 战斗时处理器
 */

public class WarPresenter implements Observer{
    private IWaringData data;
    private IWarView view;

    public WarPresenter(IWarView view) {
        this.view = view;
        //TODO LOAD DATA FROM DOMAIN
    }

    public void hitMonster() {
        view.showPerHit();
        data.hitMost();
    }

    public void healPerson(){
        view.showPerHeal();
        data.healPer();
    }


    @Override
    public void update(Observable observable, Object data) {
        if (!(observable instanceof IWaringData)) {
            return;
        }
        int type = (int) data;
        switch (type) {

        }
    }
}
