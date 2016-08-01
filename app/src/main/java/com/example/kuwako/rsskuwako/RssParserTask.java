package com.example.kuwako.rsskuwako;

import android.app.ProgressDialog;
import android.os.AsyncTask;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by kuwako on 2016/08/01.
 */
public class RssParserTask extends AsyncTask<String, Integer, RssListAdapter> {
    private MainActivity mActivity;
    private RssListAdapter mAdapter;
    private ProgressDialog mProgressDialog;

    public RssParserTask(MainActivity activity, RssListAdapter rssListAdapter) {
        mActivity = activity;
        mAdapter  = rssListAdapter;
    }

    @Override
    protected void onPreExecute() {
        mProgressDialog = new ProgressDialog(mActivity);
        mProgressDialog.setMessage("Now Loading...");
        mProgressDialog.show();
    }

    @Override
    protected RssListAdapter doInBackground(String... params) {
        RssListAdapter result = null;
        try {
            URL url = new URL(params[0]);
            InputStream is = url.openConnection().getInputStream();
            result = parseXml(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    protected void onPostExecute(RssListAdapter result) {
        mProgressDialog.dismiss();
        mActivity.setListAdapter(result);
    }

    public RssListAdapter parseXml(InputStream is) throws IOException, XmlPullParserException {
        XmlPullParser parser = XML.newPullParser();
        try {
            // TODO
            // http://itpro.nikkeibp.co.jp/article/COLUMN/20100302/345249/?ST=android-dev&P=2

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mAdapter;
    }
}
