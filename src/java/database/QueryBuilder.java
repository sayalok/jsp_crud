/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author me
 */
public class QueryBuilder {
    
    public ResultSet getDataWhere(String name, String pass) {
        Connection con = new database.Database().dbConnect();
        ResultSet rs = null;
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select * from members WHERE uname='"+name+"' AND pass='"+pass+"'");
        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
