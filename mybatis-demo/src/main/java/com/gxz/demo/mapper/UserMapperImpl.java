package com.gxz.demo.mapper;

import com.gxz.demo.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUsers() {
        return sqlSession.getMapper(UserMapper.class).selectUsers();
    }
}
