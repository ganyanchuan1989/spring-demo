import com.gxz.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         User user = (User)context.getBean("user2");
        System.out.println(user);
    }
}
