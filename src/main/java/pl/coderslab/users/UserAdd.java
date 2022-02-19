package pl.coderslab.users;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/add")
public class UserAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/users/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // tu mozna dodac petle if zeby sprawdzac czy podany username juz istnieje czy nie. Jesli istnieje to odrzucic dodanie a jesli nie istnieje to dodac

        User user = new User(username, email, password);
        new UserDao().create(user);
        resp.sendRedirect(req.getContextPath() + "/user/list");
    }
}
