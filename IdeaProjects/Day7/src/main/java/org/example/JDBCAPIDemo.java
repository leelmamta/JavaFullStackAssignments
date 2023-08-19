package org.example;

import java.sql.*;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class JDBCAPIDemo
{
    private Connection conn; // Creating a connection object
    public  void diplayProducts() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myitems","root","1234");
            System.out.println("Connected");
            Statement statement = conn.createStatement();

            int res = statement.executeUpdate("insert into myproducts values (3 , \"eyeliner\", 90, true);");
            System.out.println(res+" "+"records Updated ");
            ResultSet resultSet = statement.executeQuery("select* from myproducts");


            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        finally {
           conn.close();
           System.out.println("Connection Closed");
        }
    }

}
