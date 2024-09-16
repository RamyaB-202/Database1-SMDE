import java.math.BigDecimal;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class SJDBCPPstmt
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
            // Student1 table
        //String pstmtSInsertSql = "insert into Student1 values(?,?,?)";
        //PreparedStatement pstmtS =  con.prepareStatement(pstmtSInsertSql);
        //pstmtS.setInt(1, 6);
        //pstmtS.setString(2, "Frank");
        //pstmtS.setInt(3, 25);
        // int r = pstmtS.executeUpdate();

        // Marks table
        // String pstmtMInsertSql = "insert into Marks values(?,?,?,?)";
        // PreparedStatement pstmtM =  con.prepareStatement(pstmtMInsertSql);
        // pstmtM.setInt(1, 6);
        // pstmtM.setInt(2, 3);
        // pstmtM.setString(3, "Science");
        // pstmtM.setInt(4, 90);
        //int r = pstmtM.executeUpdate();

        // Department table
        // String pstmtDInsertSql = "insert into Department values(?,?)";
        // PreparedStatement pstmtD =  con.prepareStatement(pstmtDInsertSql);
        // pstmtD.setInt(1, 6);
        // pstmtD.setString(2, "Customer Services");
        // int r = pstmtD.executeUpdate();
        
        // Employee table
        String pstmtEInsertSql = "insert into Employee values(?, ?, ?, ?, ?)";
        PreparedStatement pstmtE =  con.prepareStatement(pstmtEInsertSql);
        pstmtE.setInt(1, 6);
        pstmtE.setString(2, "Jake");
        pstmtE.setBigDecimal(3, new BigDecimal("60000"));
        pstmtE.setString(4, "476 Phil St");
        pstmtE.setInt(5, 6);
        int r = pstmtE.executeUpdate();
        System.out.println(r);

         //Step 5: Close connection
       // System.out.println("Connection closed");
        //con.close();
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            e.printStackTrace();
        }}}
