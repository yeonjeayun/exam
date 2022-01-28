package com.example.teamfresh.repository;

import com.example.teamfresh.model.Compensate;

import java.util.List;

public interface CompensateRepository {
    public List<Compensate> selectAll() throws Exception;

    public int insert(Compensate compensate) throws Exception;
}