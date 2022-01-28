package com.example.teamfresh.service;

import com.example.teamfresh.model.Voc;

import java.util.List;

public interface VocService {
    public List<Voc> findAllVoc() throws Exception;

    public int registry(Voc voc) throws Exception;
}