package com.commentapp;


public class NetworkRequestParams {
    public enum RequestType {
        POST, GET
    }

    public RequestType requestType;
    public String networkUrl;
    public DataModel pModel;


}
