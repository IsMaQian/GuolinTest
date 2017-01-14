package com.example.mq.servicebestpractice;

/**
 * Created by Administrator on 2017/1/14.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
