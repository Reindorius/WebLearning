import com.reindorius.service.UserService;
import com.reindorius.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //注册的是Interface，而不是实现类
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.add();
        userService.query();
    }
}
