import com.gxz.demo.mapper.UserMapper;
import com.gxz.demo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    void test1() {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = sessionFactory.openSession(true);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.selectUsers();
            System.out.println(users);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper)context.getBean("userMapper");
        List<User> users = userMapper.selectUsers();
        System.out.println(users);
    }
}
