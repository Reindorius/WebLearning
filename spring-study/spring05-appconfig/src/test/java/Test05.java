import com.reindorius.config.ReindoriusConfig;
import com.reindorius.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05{
    public static void main(String[] args) {
        //use annotation instead of classpath
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ReindoriusConfig.class);
        User user = (User) applicationContext.getBean("getUser");
        System.out.println(user);
    }
}