package com.panner.common_base.listener;

/**
 * 通用回调
 * @author panzhijie
 * @version 2018-07-21 19:55
 */
public interface Callback3 {
    /**
     * 开始
     */
    void onPreExecute();

    /**
     * 结束
     */
    void onPostExecute();

    /**
     * 成功
     */
    void onSuccess();

    /**
     * 失败
     * @param e
     */
    void onError(Throwable e);

    /**
     * 完成
     */
    void onFinish();

    /**
     * 无操作通用回调
     */
    class EmptyCallback implements Callback3 {
        @Override
        public void onPreExecute() {

        }

        @Override
        public void onPostExecute() {

        }

        @Override
        public void onSuccess() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onFinish() {

        }
    }
}
