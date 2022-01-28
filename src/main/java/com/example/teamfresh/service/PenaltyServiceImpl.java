package com.example.teamfresh.service;

import com.example.teamfresh.model.PenaltyObject;
import com.example.teamfresh.model.Penalty;
import com.example.teamfresh.model.PenaltyCheckChange;
import com.example.teamfresh.repository.PenaltyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenaltyServiceImpl implements PenaltyService{
    @Autowired
    PenaltyRepository repository;

    @Override
    public List<Penalty> findAllPenalty() throws Exception {
        return repository.selectAll();
    }

    @Override
    public int registry(Penalty penalty) throws Exception {
        return repository.insert(penalty);
    }

    @Override
    public int modifyPenaltyCheck(PenaltyCheckChange penalty) throws Exception {
        return repository.updatePenaltyCheck(penalty);
    }

    @Override
    public int modifyPenaltyObject(PenaltyObject penalty) throws Exception {
        return repository.updatePenaltyObject(penalty);
    }
}