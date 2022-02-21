package pl.coderslab.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/edit")
public class UserEdit extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(UserEdit.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        int userId = Integer.parseInt(req.getParameter("id"));
        User user = new UserDao().read(userId);
        req.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");

        int userId = Integer.parseInt(req.getParameter("userId"));
        String newUsername = req.getParameter("username");
        String newEmail = req.getParameter("email");

        UserDao userDao = new UserDao();
        User userUpdated = new User(newUsername, newEmail, null);
        User user = userDao.read(userId);
        logger.info("User data to edit {}", user);
        if (userUpdated.validUserNoPass(userUpdated)) {
            user.setUserName(newUsername);
            user.setEmail(newEmail);
            userDao.update(user);
            logger.info("User updated {}", user);
            resp.sendRedirect(req.getContextPath() + "/user/list");
        } else {
            logger.info("Invalid user data");
            req.setAttribute("errorMsg", "Incorrect user data");
            getServletContext().getRequestDispatcher("/users/edit.jsp").forward(req, resp);
        }
    }

}
