package com.example.mq.servicebestpractice;

import android.os.AsyncTask;

/**
 * Created by Administrator on 2017/1/14.
 */

public class DownloadTask extends AsyncTask <String,Integer,Integer>{
    public DownloadTask() {
    }

    @Override
    protected Integer doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }
}
