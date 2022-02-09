import com.gxz.demo.config.AppConfig;
import com.gxz.demo.pojo.User;
import com.gxz.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User)context.getBean("user");
        System.out.println(user);
        UserService userService = (UserService)context.getBean("userService");
        userService.add();
    }
}
