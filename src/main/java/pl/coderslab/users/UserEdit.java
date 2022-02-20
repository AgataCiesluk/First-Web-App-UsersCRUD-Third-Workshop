package pl.coderslab.users;

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
        User user = userDao.read(userId);
        user.setUserName(newUsername);
        user.setEmail(newEmail);
        userDao.update(user);

        resp.sendRedirect(req.getContextPath() + "/user/list");
    }
}
