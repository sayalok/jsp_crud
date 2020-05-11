/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author me
 */
public class Database {

    private Connection con;

    public Connection dbConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/loginjdbc?useSSL=false",
                    "root", "123"
            );
        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }
    
    public boolean dbConClose(Connection con) {
        boolean msg = false;
        try {
            con.close();
            msg = true;
        } catch (Exception e) {
            msg = false;
        }
        return msg;
    }

    
    public static void main(String[] args) throws SQLException {
        
    }
}
