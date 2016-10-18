package com.commentapp;

import android.os.AsyncTask;
import android.text.TextUtils;

import org.json.JSONObject;

public class NetworkHelper extends AsyncTask<Void, Void, Void> {

    public interface ServiceCallback {
        void onSuccess(JSONObject pJsonObject);

        void onError(String reason);
    }

    private NetworkRequestParams mNetworkParams;

    private ServiceCallback mCallback;

    private String mErrorString;

    private JSONObject mJSONResponse;


    public NetworkHelper(NetworkRequestParams pNetworkParams, ServiceCallback pCallback) {
        this.mNetworkParams = pNetworkParams;
        this.mCallback = pCallback;
    }


    @Override
    protected Void doInBackground(Void... voids) {
        return makeNetworkRequest();
    }


    private Void makeNetworkRequest() {
        try {
            if (this.mNetworkParams.requestType == NetworkRequestParams.RequestType.GET) {
                makeGetRequest();
            } else if (this.mNetworkParams.requestType == NetworkRequestParams.RequestType.POST) {
                makePostRequest();
            } else {
                return null;
            }
        } catch (NullPointerException ex) {

        }
        return null;
    }


    /**
     * Make a network GET Request. <br/>
     * All the network exceptions will be handled from HTTPUrlConnection or either
     * thrown from
     */
    private void makeGetRequest() {
        String url = this.mNetworkParams.networkUrl;
        /*Make a GET network call here using either HTTPUrlConnection or any third party library ex. OkHttpClient*/
    }


    /**
     * Make a network POST Request
     */
    private void makePostRequest() {
        String url = this.mNetworkParams.networkUrl;
        JSONObject jsonData = this.mNetworkParams.pModel.getJSONData();
        /*Make a POST network call here using either HTTPUrlConnection or any third party library ex. OkHttpClient*/
    }


    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        if (this.mCallback != null) {
            if (TextUtils.isEmpty(this.mErrorString)) {
                this.mCallback.onSuccess(this.mJSONResponse);
            } else {
                this.mCallback.onError(this.mErrorString);
            }
        }
    }
}
