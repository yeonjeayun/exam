package com.example.teamfresh.repository;

import com.example.teamfresh.model.PenaltyObject;
import com.example.teamfresh.model.Penalty;
import com.example.teamfresh.model.PenaltyCheckChange;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PenaltyRepositoryImpl implements PenaltyRepository {
    private static final String MAPPER_NAME_SPACE = "penalty.";

    @Autowired
    SqlSession sqlSession;

    @Override
    public List<Penalty> selectAll() throws Exception {
        return sqlSession.selectList(MAPPER_NAME_SPACE + "selectAll");
    }

    @Override
    public int insert(Penalty penalty) throws Exception {
        return sqlSession.insert(MAPPER_NAME_SPACE + "insertPenalty", penalty);
    }

    @Override
    public int updatePenaltyCheck(PenaltyCheckChange penalty) throws Exception {
        return sqlSession.update(MAPPER_NAME_SPACE + "updatePenaltyCheck", penalty);
    }

    @Override
    public int updatePenaltyObject(PenaltyObject penalty) throws Exception {
        return sqlSession.update(MAPPER_NAME_SPACE + "updatePenaltyObject", penalty);
    }

}