package com.example.teamfresh.model;

public class Penalty {
    private int penalty_fee;
    private String fault_content;
    private boolean penalty_check;
    private boolean object_check;
    private String object_content;
    private String driver_id;
    private String voc_id;
    private String penalty_id;

    public Penalty(){
        
    }

    public Penalty(int penalty_fee, String fault_content, boolean penalty_check, boolean object_check, String object_content, String driver_id, String voc_id, String penalty_id) {
        this.penalty_fee = penalty_fee;
        this.fault_content = fault_content;
        this.penalty_check = penalty_check;
        this.object_check = object_check;
        this.object_content = object_content;
        this.driver_id = driver_id;
        this.voc_id = voc_id;
        this.penalty_id = penalty_id;
    }

    public int getPenalty_fee() {
        return penalty_fee;
    }

    public void setPenalty_fee(int penalty_fee) {
        this.penalty_fee = penalty_fee;
    }

    public String getFault_content() {
        return fault_content;
    }

    public void setFault_content(String fault_content) {
        this.fault_content = fault_content;
    }

    public boolean isPenalty_check() {
        return penalty_check;
    }

    public void setPenalty_check(boolean penalty_check) {
        this.penalty_check = penalty_check;
    }

    public boolean isObject_check() {
        return object_check;
    }

    public void setObject_check(boolean object_check) {
        this.object_check = object_check;
    }

    public String getObject_content() {
        return object_content;
    }

    public void setObject_content(String object_content) {
        this.object_content = object_content;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getVoc_id() {
        return voc_id;
    }

    public void setVoc_id(String voc_id) {
        this.voc_id = voc_id;
    }

    public String getPenalty_id() {
        return penalty_id;
    }

    public void setPenalty_id(String penalty_id) {
        this.penalty_id = penalty_id;
    }
}
