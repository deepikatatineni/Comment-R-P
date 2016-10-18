package com.commentapp;


import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment extends DataModel {

    private String mCommentText;
    private String mDateCommented;

    public Comment(String pComment) {
        setCommentText(pComment);
        setDateCommented(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
    }


    public String getCommentText() {
        return mCommentText;
    }

    public void setCommentText(String mCommentText) {
        this.mCommentText = mCommentText;
    }

    public String getDateCommented() {
        return mDateCommented;
    }

    public void setDateCommented(String mDateCommented) {
        this.mDateCommented = mDateCommented;
    }

    @Override
    public void parseResponse() {

    }

    @Override
    public JSONObject getJSONData() {
        return null;
    }
}
