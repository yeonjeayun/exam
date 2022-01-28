package com.example.teamfresh.repository;

import com.example.teamfresh.model.Compensate;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompensateRepositoryImpl implements CompensateRepository {
    private static final String MAPPER_NAME_SPACE = "compensate.";

    @Autowired
    SqlSession sqlSession;

    @Override
    public List<Compensate> selectAll() throws Exception {
        return sqlSession.selectList(MAPPER_NAME_SPACE + "selectAll");
    }

    @Override
    public int insert(Compensate compensate) throws Exception {
        return sqlSession.insert(MAPPER_NAME_SPACE + "insertCompensate", compensate);
    }

}