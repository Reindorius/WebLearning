import com.reindorius.service.UserService;
import com.reindorius.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务（service）层，Reindo层不需要接触
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
