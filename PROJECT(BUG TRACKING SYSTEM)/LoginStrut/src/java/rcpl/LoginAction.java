/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Atul
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginBean lb=(LoginBean)form;
        String name=lb.getT1();
        String pass=lb.getT2();
        boolean status=false;
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","LPU");
            PreparedStatement pst=(PreparedStatement) con.prepareStatement("select * from sign where name=? and pass=?");
            pst.setString(1,name);
            pst.setString(2,pass);
            ResultSet rs=pst.executeQuery();
            status=rs.next();
            if(status)
            {
                request.setAttribute("msg",name);
            SUCCESS="s";  
            }
            else
            {
              request.setAttribute("mssg", "login failed");
              SUCCESS="f";  
            }
            
           /* while(rs.next())
            {
                if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2)))
                {
                  request.setAttribute("msg",name);
            SUCCESS="s";  
                }
                else
        {
            request.setAttribute("mssg", "login failed");
              SUCCESS="f";
        }
            }*/
            //int status=pst.executeUpdate();
            
       /* if(status>0)
        {
            request.setAttribute("msg",name);
            SUCCESS="s";
        }
        else
        {
            request.setAttribute("mssg", "login failed");
              SUCCESS="f";
        }*/
        return mapping.findForward(SUCCESS);
    }
}
