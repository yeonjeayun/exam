package com.example.teamfresh.repository;

import com.example.teamfresh.model.Voc;

import java.util.List;

public interface VocRepository {
    public List<Voc> selectAll() throws Exception;

    public int insert(Voc voc) throws Exception;
}