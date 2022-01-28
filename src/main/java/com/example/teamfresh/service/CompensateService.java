package com.example.teamfresh.service;

import com.example.teamfresh.model.Compensate;

import java.util.List;

public interface CompensateService {
    public List<Compensate> findAllCompensate() throws Exception;

    public int registry(Compensate compensate) throws Exception;
}