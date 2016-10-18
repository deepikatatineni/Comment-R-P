package com.commentapp;


import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Annotation extends DataModel {

    private Comment mComment;
    private String mAnnotationDate;

    public Annotation(Comment pComment) {
        setComment(pComment);
        setAnnotationDate(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
    }


    public Annotation(JSONObject pJSONObject) {
        parseResponse();
    }

    public String getAnnotationDate() {
        return mAnnotationDate;
    }

    public void setAnnotationDate(String mAnnotationDate) {
        this.mAnnotationDate = mAnnotationDate;
    }

    public Comment getComment() {
        return mComment;
    }

    public void setComment(Comment mComment) {
        this.mComment = mComment;
    }

    @Override
    public void parseResponse() {

    }

    @Override
    public JSONObject getJSONData() {
        return null;
    }
}
