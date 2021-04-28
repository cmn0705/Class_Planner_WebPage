// Get the data from the HTML text box
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Save extends HttpServlet
{
public void doGet (HttpServletRequest req, HttpServletResponse res) 
throws ServletException, IOException
           {   doPost(req, res);  }

public void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
 {
  String formData = "";
  formData+="Class Time,Mon,Tue,Wed,Thu,Fri,Sat \n";
  formData+="08:40 to 11:35" + "," + req.getParameter("mon1") + "," + req.getParameter("tue1") + "," + req.getParameter("wed1") + "," + req.getParameter("thu1") + "," + req.getParameter("fri1") + "," + req.getParameter("sat1") + "\n";
  formData+="12:20 to 15:10" + "," + req.getParameter("mon2") + "," + req.getParameter("tue2") + "," + req.getParameter("wed2") + "," + req.getParameter("thu2") + "," + req.getParameter("fri2") + "," + req.getParameter("sat2") + "\n";
  formData+="15:20 to 18:10" + "," + req.getParameter("mon3") + "," + req.getParameter("tue3") + "," + req.getParameter("wed3") + "," + req.getParameter("thu3") + "," + req.getParameter("fri3") + "," + req.getParameter("sat3") + "\n";
  formData+="18:20 to 21:10" + "," + req.getParameter("mon4") + "," + req.getParameter("tue4") + "," + req.getParameter("wed4") + "," + req.getParameter("thu4") + "," + req.getParameter("fri4") + "," + req.getParameter("sat4") + "\n";
   BufferedWriter outFile = new BufferedWriter(new FileWriter("../webapps/ClassPlanner/WEB-INF/Schedule.csv"));
   outFile.write(formData);
   outFile.close();

   res.setContentType("text/html");
   PrintWriter msg = res.getWriter();
   msg.println("<h3>Your Schedule is saved!<h3>");

 } // doPost
} // Search