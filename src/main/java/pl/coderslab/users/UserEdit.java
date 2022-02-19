package pl.coderslab.users;

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
        int userId = Integer.parseInt(req.getParameter("id"));
        resp.getWriter().println("You want to modify user with ID: " + userId);
    }
}
