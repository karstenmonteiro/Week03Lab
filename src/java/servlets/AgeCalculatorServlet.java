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
public class AgeCalculatorServlet extends HttpServlet {
    
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        // get the value of "age" entered by the user
        String age = request.getParameter("age");
        
        /**
         * VALIDATION
         */
        if (age == null || age.equals("")) {
            // null value, display 'nullValueMsg'
            request.setAttribute("nullValueMsg", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        else if (!age.matches("[0-9]+")) {
            // invalid value, dislpay 'invalidValueMsg'
            request.setAttribute("invalidValueMsg", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        else {
            // valid value, calculate user's next age
            int nextAge = Integer.parseInt(age) + 1;
            String nextAgeMsg = "Your age next birthday will be " + nextAge + ".";
            // display result
            request.setAttribute("nextAgeMsg", nextAgeMsg);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }
}
