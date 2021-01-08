package com.chm.bledemo.bleutils.callback;

/**
 * 类名: ConnectCallback

 * 描述: 连接回到
 */
public interface ConnectCallback {
    /**
     *  获得通知之后
     */

    void onConnSuccess();

    /**
     * 断开或连接失败
     */
    void onConnFailed();
}
