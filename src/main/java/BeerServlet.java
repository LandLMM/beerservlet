import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BeerServlet", value = "/beer")
public class BeerServlet extends HttpServlet {

    private static final String PIWO = "piwo";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String beerType = req.getParameter("rodzaj");
        if (beerType.equals("jasne")) {
            req.setAttribute(PIWO, "Warka");

        } else if (beerType.equals("cienme")) {
            req.setAttribute(PIWO, "Warka Strong");

        } else if (beerType.equals("mocne")) {
            req.setAttribute(PIWO, "Wojak");

        } else if (beerType.equals("dla kobiet")) {
            req.setAttribute(PIWO, "Redds");
        }
        RequestDispatcher rD = req.getRequestDispatcher("beer.jsp");
        rD.forward(req, resp);
    }
}
