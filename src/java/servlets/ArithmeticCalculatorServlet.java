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

    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // initialize resultMsg
        request.setAttribute("resultMsg", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the parameters from the "arithmeticcalculator.jsp" form
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
            // null and/or invalid value(s), display error message
            request.setAttribute("resultMsg", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        /** submit button actions */
        else if (add != null) {
            // calculate result using addition
            result = Integer.parseInt(first) + Integer.parseInt(second);
            // display result message
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (subtract != null) {
            // calculate result using subtraction
            result = Integer.parseInt(first) - Integer.parseInt(second);
            // display result message
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (multiply != null) {
            // calculate result using multiplication
            result = Integer.parseInt(first) * Integer.parseInt(second);
            // display result message
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else if (modulos != null) {
            // calculate result using modulos
            result = Integer.parseInt(first) % Integer.parseInt(second);
            // display result message
            request.setAttribute("resultMsg", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }
}
