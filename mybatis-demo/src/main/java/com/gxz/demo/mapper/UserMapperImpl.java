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
        User user = new User();
        user.setName("gxz");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(user);

        mapper.deleteUser(1);

        return sqlSession.getMapper(UserMapper.class).selectUsers();
    }

    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
}
