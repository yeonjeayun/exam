package com.example.teamfresh.service;

import com.example.teamfresh.model.Voc;
import com.example.teamfresh.repository.VocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VocServiceImpl implements VocService{
    @Autowired
    VocRepository repository;

    @Override
    public List<Voc> findAllVoc() throws Exception {
        return repository.selectAll();
    }

    @Override
    public int registry(Voc voc) throws Exception {
        return repository.insert(voc);
    }
}