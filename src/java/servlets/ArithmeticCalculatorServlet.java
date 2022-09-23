package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karsten Monteiro
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // initialize the result message
        request.setAttribute("resultMsg", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get parameters from 'arithmeticcalculator.jsp')
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String add = request.getParameter("add");
        String subtract = request.getParameter("subtract");
        String multiply = request.getParameter("multiply");
        String modulos = request.getParameter("modulos");
        int result;
                
        // keep the text boxes populated with the values the user previously entered
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        /** validation */
        if (first == null || first.equals("") || second == null || second.equals("") || (!first.matches("[0-9]+")) || (!second.matches("[0-9]+"))) {
            // invalid, display error message
            request.setAttribute("resultMsg", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        /** submit button actions */
        else if (add != null) {
            // valid, display the result
            result = Integer.parseInt(first) + Integer.parseInt(second);
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (subtract != null) {
            // valid, display the result
            result = Integer.parseInt(first) - Integer.parseInt(second);
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (multiply != null) {
            // valid, display the result
            result = Integer.parseInt(first) * Integer.parseInt(second);
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (modulos != null) {
            // valid, display the result
            result = Integer.parseInt(first) / Integer.parseInt(second);
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }
}