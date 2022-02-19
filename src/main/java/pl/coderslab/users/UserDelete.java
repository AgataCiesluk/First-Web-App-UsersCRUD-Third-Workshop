package pl.coderslab.users;

import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/delete")
public class UserDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");

        int userIdToDelete = Integer.parseInt(req.getParameter("userIdToDelete"));
        UserDao userDao = new UserDao();
        userDao.delete(userIdToDelete);
        resp.sendRedirect(req.getContextPath() + "/user/list");
    }
}
