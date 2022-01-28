package com.example.teamfresh.model;

public class Compensate {
    private int penalty_fee;
    private String fault_content;
    private String tc_id;
    private String cc_id;
    private String voc_id;
    private String compensate_id;
    private String driver_id;

    public Compensate(){

    }

    public Compensate(int penalty_fee, String fault_content, String tc_id, String cc_id, String voc_id, String compensate_id, String driver_id) {
        this.penalty_fee = penalty_fee;
        this.fault_content = fault_content;
        this.tc_id = tc_id;
        this.cc_id = cc_id;
        this.voc_id = voc_id;
        this.compensate_id = compensate_id;
        this.driver_id = driver_id;
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

    public String getTc_id() {
        return tc_id;
    }

    public void setTc_id(String tc_id) {
        this.tc_id = tc_id;
    }

    public String getCc_id() {
        return cc_id;
    }

    public void setCc_id(String cc_id) {
        this.cc_id = cc_id;
    }

    public String getVoc_id() {
        return voc_id;
    }

    public void setVoc_id(String voc_id) {
        this.voc_id = voc_id;
    }

    public String getCompensate_id() {
        return compensate_id;
    }

    public void setCompensate_id(String compensate_id) {
        this.compensate_id = compensate_id;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }
}
