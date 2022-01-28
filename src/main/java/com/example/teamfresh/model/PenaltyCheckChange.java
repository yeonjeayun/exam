package com.example.teamfresh.model;

public class PenaltyCheckChange {
    private boolean penalty_check;
    private String penalty_id;

    public PenaltyCheckChange(){

    }

    public PenaltyCheckChange(boolean penalty_check, String penalty_id) {
        this.penalty_check = penalty_check;
        this.penalty_id = penalty_id;
    }

    public boolean isPenalty_check() {
        return penalty_check;
    }

    public void setPenalty_check(boolean penalty_check) {
        this.penalty_check = penalty_check;
    }

    public String getPenalty_id() {
        return penalty_id;
    }

    public void setPenalty_id(String penalty_id) {
        this.penalty_id = penalty_id;
    }
}
