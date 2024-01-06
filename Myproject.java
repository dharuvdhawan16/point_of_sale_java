/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static myproject.dbvar.dpass;
import static myproject.dbvar.durl;
import static myproject.dbvar.duser;

public class Myproject implements dbvar {
    
    public static void main(String[] args) {
        
    try{

       
         Connection con =DriverManager.getConnection(durl ,duser,dpass );
        try{
         
          String q="select * from empl where user = 'admin'";
        PreparedStatement myst = (PreparedStatement) con.prepareStatement(q);
        ResultSet rs =myst.executeQuery();
        
        if(rs.next())
        {
        
            login obj = new login();
            
            obj.setVisible(true);
            
        }
        
        else
        {
        
            createadmin1 obj = new createadmin1();
            
            obj.setVisible(true);
        
        }
        
        
        
        }
        catch(SQLException e)
        {        
        JOptionPane.showMessageDialog(null,e);
        }
        
        finally
        {
        
          con.close();
        }
}
catch(Exception e)
{

JOptionPane.showMessageDialog(null,"Cannot connect"+e.getMessage());

} 
        
    }
    
    
    
    
}
