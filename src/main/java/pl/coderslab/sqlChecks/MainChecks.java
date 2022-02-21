package pl.coderslab.sqlChecks;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.List;

public class MainChecks {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        List<User> allUsers = userDao.findAllWeb();
        for (User user : allUsers) {
            System.out.println(user.getUserName());
        }
    }
}
