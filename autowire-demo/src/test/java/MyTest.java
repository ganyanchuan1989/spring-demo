import com.gxz.demo.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = (Pet)context.getBean("pet");
        System.out.println(pet);
    }
}
