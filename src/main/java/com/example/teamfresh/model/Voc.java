package com.example.teamfresh.model;

public class Voc {
    private boolean voc_claim;
    private String voc_fault;
    private int penalty_fee;
    private String fault_content;
    private String cc_id;
    private String tc_id;
    private String driver_id;
    private String voc_id;

    public Voc(){

    }

    public Voc(boolean voc_claim, String voc_fault, int penalty_fee, String fault_content, String cc_id, String tc_id, String driver_id, String voc_id) {
        this.voc_claim = voc_claim;
        this.voc_fault = voc_fault;
        this.penalty_fee = penalty_fee;
        this.fault_content = fault_content;
        this.cc_id = cc_id;
        this.tc_id = tc_id;
        this.driver_id = driver_id;
        this.voc_id = voc_id;
    }

    public boolean getVoc_claim() {
        return voc_claim;
    }

    public void setVoc_claim(boolean voc_claim) {
        this.voc_claim = voc_claim;
    }

    public String getVoc_fault() {
        return voc_fault;
    }

    public void setVoc_fault(String voc_fault) {
        this.voc_fault = voc_fault;
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

    public String getCc_id() {
        return cc_id;
    }

    public void setCc_id(String cc_id) {
        this.cc_id = cc_id;
    }

    public String getTc_id() {
        return tc_id;
    }

    public void setTc_id(String tc_id) {
        this.tc_id = tc_id;
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
}
