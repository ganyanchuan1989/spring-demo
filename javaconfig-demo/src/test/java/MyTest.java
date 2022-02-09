import com.gxz.demo.config.AppConfig;
import com.gxz.demo.pojo.Dog;
import com.gxz.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User)context.getBean("user");
        Dog dog = (Dog)context.getBean("dog");
        System.out.println(user);
        System.out.println(dog);
    }
}
