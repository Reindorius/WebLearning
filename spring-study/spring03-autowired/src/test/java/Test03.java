import org.junit.Test;
import com.reindorius.pojo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    @Test
    public void test1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        /**
         * //非自动装配
        Person person = applicationContext.getBean("person",Person.class);
        person.getDog().Bark();
        person.getCat().Meow();
         */

        //使用自动装配
        Person person1 = applicationContext.getBean("person",Person.class);
        person1.getCat().Meow();
        person1.getDog().Bark();
    }
}