import com.reindorius.pojo.Hello;
import com.reindorius.pojo.User;
import com.reindorius.pojo2.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest01 {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //现在对象都由spring管理，要是用的话只需要去取即可
        /**
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello);
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        User user1 = (User) applicationContext.getBean("user1");
        System.out.println(user1);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getInfo().getProperty("AST"));
         */

        /**
        //Singleton scope
        Student student2 = (Student) applicationContext.getBean("student");
        Student student3 = (Student) applicationContext.getBean("student");
        System.out.println(student2.hashCode() == student3.hashCode());
        //We implement singleton pattern, and thus the two instances are the same.
         */

        //prototype scope
        User user3 = (User) applicationContext.getBean("user3");
        User user4 = (User) applicationContext.getBean("user3");
        System.out.println(user3.hashCode() == user4.hashCode());
    }
}
