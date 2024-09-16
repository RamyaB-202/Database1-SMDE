import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class SJDBCPInsert
 {
    public static void main(String[] args)throws SQLException{
        //Step 1: Register the driver class
        Connection con;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //step 2: Open DB connection
        String URL = "jdbc:oracle:thin:@localhost:1522:xe";
        String USER = "system";
        String PASSWORD = "ramz0dbt2orac";
         con = DriverManager.getConnection(URL,USER,PASSWORD);
            if(con==null){
                System.out.println("Connection Unsuccessful");
            }else{
                System.out.println("Connection Successful");
            }
            Statement stmt = con.createStatement();
            // Student1 table
            //String insertquery = "INSERT INTO Student1 VALUES(1, 'Alice', 20)";
            //String insertquery = "INSERT INTO Student1 VALUES(2, 'Bob', 21)";
            //String insertquery = "INSERT INTO Student1 VALUES(3, 'Charlie', 22)";
            //String insertquery = "INSERT INTO Student1 VALUES(4, 'David', 23)";
            //String insertquery = "INSERT INTO Student1 VALUES(5, 'Eve', 24)";

            // Marks table
            //String insertquery = "INSERT INTO Marks VALUES(1, 1, 'Math', 85)";
            //String insertquery = "INSERT INTO Marks VALUES(2, 1, 'Science', 90)";
            //String insertquery = "INSERT INTO Marks VALUES(3, 2, 'Math', 78)";
            //String insertquery = "INSERT INTO Marks VALUES(4, 2, 'Science', 88)";
            //String insertquery = "INSERT INTO Marks VALUES(5, 3, 'Math', 92)";

            // Department table
            //String insertquery = "INSERT INTO Department VALUES(1, 'HR')";
            //String insertquery = "INSERT INTO Department VALUES(2, 'Finance')";
            //String insertquery = "INSERT INTO Department VALUES(3, 'Engineering')";
            //String insertquery = "INSERT INTO Department VALUES(4, 'Marketing')";
            //String insertquery = "INSERT INTO Department VALUES(5, 'Sales')";

            // Employee table
           //String insertquery = "INSERT INTO Employee VALUES(1, 'John', 50000, '123 Main St', 1)";
           //String insertquery = "INSERT INTO Employee VALUES(2, 'Jane', 60000, '456 Elm St', 2)";
           //String insertquery = "INSERT INTO Employee VALUES(3, 'Jim', 55000, '789 Oak St', 3)";
           //String insertquery = "INSERT INTO Employee VALUES(4, 'Jill', 70000, '101 Pine St', 4)";
           String insertquery = "INSERT INTO Employee VALUES(5, 'Jack', 65000, '202 Maple St', 5)";
           int output = stmt.executeUpdate(insertquery);
           System.out.println(output);
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            e.printStackTrace();
        }}}