package com.commentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void getComments() {
        NetworkRequestParams params = new NetworkRequestParams();
        params.networkUrl = AppConstants.GET_COMMENTS;
        params.pModel = new Comments();
        params.requestType = NetworkRequestParams.RequestType.GET;
        new NetworkHelper(params, new NetworkHelper.ServiceCallback() {
            @Override
            public void onSuccess(JSONObject pJsonObject) {

            }

            @Override
            public void onError(String reason) {

            }
        }).execute();
    }


    private void getCommentById(String pCommentId) {
        NetworkRequestParams params = new NetworkRequestParams();
        params.networkUrl = AppConstants.GET_COMMENT_BY_ID + pCommentId;
        params.pModel = new Comments();
        params.requestType = NetworkRequestParams.RequestType.GET;
        new NetworkHelper(params, new NetworkHelper.ServiceCallback() {
            @Override
            public void onSuccess(JSONObject pJsonObject) {

            }

            @Override
            public void onError(String reason) {

            }
        }).execute();

    }


}
