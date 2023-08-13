package org.example;

import java.sql.SQLException;

public class JDBCMainDemo {
    public static void main(String[] args) throws SQLException {
        JDBCAPIDemo queryObj = new JDBCAPIDemo();
        queryObj.diplayProducts();
    }
}
