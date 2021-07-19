import com.reindorius.pojo.Hello;
import com.reindorius.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest01 {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //现在对象都由spring管理，要是用的话只需要去取即可
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello);
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        User user1 = (User) applicationContext.getBean("user1");
        System.out.println(user1);
    }
}
