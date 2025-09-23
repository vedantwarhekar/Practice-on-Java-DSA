/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Seven Step for Connecting Database Using JDBC 1) import java sql 2) download
 * the driver accordingly of our database(Mysql or postgres) 3) add the diver in
 * our project properties/library 4) Create Connection 5) create the
 * statement(query) 6) Execute the query 7) process the result
 *
 * @author User
 */
public class JDBCConncection1 {

    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5433/vedant_social_app";
        String user = "postgres";
        String password = "root";
        String query = "SELECT * FROM users where id=102";
        
        try {
            Class.forName("org.postgresql.Driver"); // Optional but safe  
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected with postgress sql");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next()) {
                String firstName = rs.getString("first_name");
                String gender = rs.getString("gender");
                String email = rs.getString("email");

                System.out.println(firstName);
                System.out.println(email);
                System.out.println(gender);
            }else{
                     System.out.println("No user found with id=102.");
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
