package com.example.teamfresh.model;

public class PenaltyObject {
    private boolean object_check;
    private String object_content;
    private String penalty_id;

    public PenaltyObject(){

    }

    public PenaltyObject(boolean object_check, String object_content, String penalty_id) {
        this.object_check = object_check;
        this.object_content = object_content;
        this.penalty_id = penalty_id;
    }

    public boolean isObject_check() {
        return object_check;
    }

    public void setObject_check(boolean object_check) {
        this.object_check = object_check;
    }

    public String getPenalty_id() {
        return penalty_id;
    }

    public void setPenalty_id(String penalty_id) {
        this.penalty_id = penalty_id;
    }

    public String getObject_content() {
        return object_content;
    }

    public void setObject_content(String object_content) {
        this.object_content = object_content;
    }
}
