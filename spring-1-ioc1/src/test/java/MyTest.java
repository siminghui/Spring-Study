import com.hui.dao.UserDaoImpl;
import com.hui.dao.UserDaoOracelImpl;
import com.hui.service.UserService;
import com.hui.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层，dao层不需要接触
//        UserServiceImpl userService = new UserServiceImpl();

        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoOracelImpl());

        userService.getUser();

    }
}
