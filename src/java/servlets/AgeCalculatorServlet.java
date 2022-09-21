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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // retrieve the 'age' parameter from the form in 'agecalculator.jsp'
        String age = request.getParameter("age");
        
        // display the values for 'firstname' and 'lastname' entered by the user
        request.setAttribute("age", age);
        
        // validation
        if (age == null || age.equals("")) {
            // invalid, display an error message
            request.setAttribute("nullErrorMsg", "You must give your current age.");
            // send the user back to helloWorldForm.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            return;
        }
        else if (!age.matches("[0-9]+")) {
            // invalid, display an error message
            request.setAttribute("charErrorMsg", "You must enter a number.");
            // send the user back to helloWorldForm.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            return;
        }
        else {
            // valid, display 'next age' message
            int nextAge = Integer.parseInt(age) + 1;
            String nextAgeMsg = "Your age next birthday will be " + nextAge;
            
            request.setAttribute("nextAgeMsg", nextAgeMsg);
            // send the user back to helloWorldForm.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        
        // pass the variables into the request Object (set the attributes)
        request.setAttribute("age", age);
        
        // forward the request/response objects to the 'sayHello.jsp' file
        getServletContext().getRequestDispatcher("/WEB-INF/agecalulator.jsp").forward(request, response);
    }
}