package com.commentapp;

import org.json.JSONObject;

public abstract class DataModel {


    /**
     * Parse the network response from json object into models.
     */
    public abstract void parseResponse();


    /**
     * Frame JSON data respresentation for the class model.
     * @return
     */
    public abstract JSONObject getJSONData();




}
