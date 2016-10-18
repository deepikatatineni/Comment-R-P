package com.commentapp;

import org.json.JSONObject;

import java.util.ArrayList;

public class Comments extends DataModel{

    private ArrayList<Comment> mCommentList;


    


    @Override
    public void parseResponse() {

    }

    @Override
    public JSONObject getJSONData() {
        return null;
    }

    public ArrayList<Comment> getCommentList() {
        return mCommentList;
    }

    public void setCommentList(ArrayList<Comment> mCommentList) {
        this.mCommentList = mCommentList;
    }
}
