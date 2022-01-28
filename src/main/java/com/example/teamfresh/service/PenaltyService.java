package com.example.teamfresh.service;

import com.example.teamfresh.model.PenaltyObject;
import com.example.teamfresh.model.Penalty;
import com.example.teamfresh.model.PenaltyCheckChange;

import java.util.List;

public interface PenaltyService {
    public List<Penalty> findAllPenalty() throws Exception;

    public int registry(Penalty penalty) throws Exception;

    public int modifyPenaltyCheck(PenaltyCheckChange penalty) throws Exception;

    public int modifyPenaltyObject(PenaltyObject penalty) throws Exception;


}