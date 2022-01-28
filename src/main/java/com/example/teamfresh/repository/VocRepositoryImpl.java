package com.example.teamfresh.repository;

import com.example.teamfresh.model.Voc;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VocRepositoryImpl implements VocRepository {
    private static final String MAPPER_NAME_SPACE = "voc.";

    @Autowired
    SqlSession sqlSession;

    @Override
    public List<Voc> selectAll() throws Exception {
        return sqlSession.selectList(MAPPER_NAME_SPACE + "selectAll");
    }

    @Override
    public int insert(Voc voc) throws Exception {
        return sqlSession.insert(MAPPER_NAME_SPACE + "insertVoc", voc);
    }

}