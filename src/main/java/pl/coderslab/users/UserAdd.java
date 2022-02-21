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

@WebServlet("/user/add")
public class UserAdd extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(UserAdd.class);

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
        logger.info("User to add: {}", user);
        if (user.validUser(user)){
            new UserDao().create(user);
            logger.info("User created: {}", user);
            resp.sendRedirect(req.getContextPath() + "/user/list");
        } else {
            logger.info("Invalid user data");
            req.setAttribute("errorMsg", "Incorrect user data");
            getServletContext().getRequestDispatcher("/users/add.jsp").forward(req, resp);
        }

    }
}
