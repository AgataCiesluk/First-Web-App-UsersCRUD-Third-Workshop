package pl.coderslab.sqlChecks;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainChecks {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User[] allUsers = userDao.findAllWeb();
        for (User user : allUsers) {
            System.out.println(user.getUserName());
        }
    }
}
