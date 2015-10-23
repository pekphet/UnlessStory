package com.pekphet.unlessstory.view.inter;

import com.pekphet.unlessstory.base.IBaseView;

/**
 * Created by Administrator on 2015/10/23.
 */

/**
 * 战斗时的界面接口
 */
public interface IWarView extends IBaseView {
    void showPerHit();
    void showMonHit();
    void showPerHeal();
    void showMonHeal();
    void showPerEscape();
    void end();
}
