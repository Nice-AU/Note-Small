package onlynote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.swing.*;

/**
 *
 * @author ALAN
 */
public class NewConnData {
    
        Connection conn = null;
    
    public static Connection ConnecrDb(){
    
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Alan\\Note//Nice_Application1.NiceApp1SHB");

    
    return conn;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
        return null;

    
    }
    
    
    }
    
    
}
    

    

