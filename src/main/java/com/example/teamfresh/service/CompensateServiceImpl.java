package com.example.teamfresh.service;

import com.example.teamfresh.model.Compensate;
import com.example.teamfresh.repository.CompensateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompensateServiceImpl implements CompensateService{
    @Autowired
    CompensateRepository repository;

    @Override
    public List<Compensate> findAllCompensate() throws Exception {
        return repository.selectAll();
    }

    @Override
    public int registry(Compensate compensate) throws Exception {
        return repository.insert(compensate);
    }
}