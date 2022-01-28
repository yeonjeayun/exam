package com.example.teamfresh.repository;

import com.example.teamfresh.model.PenaltyObject;
import com.example.teamfresh.model.Penalty;
import com.example.teamfresh.model.PenaltyCheckChange;

import java.util.List;

public interface PenaltyRepository {
    public List<Penalty> selectAll() throws Exception;

    public int insert(Penalty penalty) throws Exception;

    public int updatePenaltyCheck(PenaltyCheckChange penalty) throws Exception;

    public int updatePenaltyObject(PenaltyObject penalty) throws Exception;

}