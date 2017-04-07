package cn.mobilemd.dao;

import cn.mobilemd.domain.TestPOJO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yanjie.miao on 2017/4/7.
 */

@Component
public class TestDao {

    private final SqlSession sqlSession;

    public TestDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
    public List<TestPOJO> get(int age) {
        return this.sqlSession.selectOne("get", age);
    }

}
