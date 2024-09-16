import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class SJDBCPCreate
 {
    public static void main(String[] args)throws SQLException{
        //Step 1: Register the driver class
        Connection con;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //step 2: Open DB connection
        String URL = "jdbc:oracle:thin:@localhost:1522:xe";
        String USER = "system";
        String PASSWORD = "********";
         con = DriverManager.getConnection(URL,USER,PASSWORD);
            if(con==null){
                System.out.println("Connection Unsuccessful");
            }else{
                System.out.println("Connection Successful");
            }
            //step 3: Create statement
        Statement stmt = con.createStatement();
           //String createquery = "CREATE TABLE Student1(StudentID INT PRIMARY KEY,Name VARCHAR(50),Age INT)";
           //String createquery = "CREATE TABLE Marks (MarkID INT PRIMARY KEY,StudentID INT,Subject VARCHAR(50),Marks INT,FOREIGN KEY (StudentID) REFERENCES Student1(StudentID))";
           //String createquery = "CREATE TABLE Department (Did INT PRIMARY KEY,Dname VARCHAR(50))";
           String createquery = "CREATE TABLE Employee (Eid INT PRIMARY KEY,Ename VARCHAR(50),Salary DECIMAL(10, 2),Address VARCHAR(100),Did INT,FOREIGN KEY (Did) REFERENCES Department(Did))";
            int output = stmt.executeUpdate(createquery);
            System.out.println(output);
         //Step 5: Close connection
          System.out.println("Connection closed");
          con.close();
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            e.printStackTrace();
        }}}
