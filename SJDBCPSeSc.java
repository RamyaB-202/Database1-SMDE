import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class SJDBCPSeSc
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
            Statement stmt = con.createStatement();
         
            // Student1 table
            // String selectquery = "select * from Student1";
            // ResultSet rsS = stmt.executeQuery(selectquery);
            //  while (rsS.next()){
            //     System.out.println(rsS.getInt(1) + " " + rsS.getString(2) + " " + rsS.getInt(3));
            //     System.out.println(rsS.getInt("studentid") + " " + rsS.getString("name") + " " + rsS.getInt("age"));
            // }
         
            // Marks table
            // String selectquery = "select * from Marks";
            // ResultSet rsM = stmt.executeQuery(selectquery);
            //  while (rsM.next()){
            //     System.out.println(rsM.getInt(1) + " " + rsM.getInt(2) + " " + rsM.getString(3) + " " + rsM.getInt(4));
            //     System.out.println(rsM.getInt("markid") + " " + rsM.getInt("studentid") + " " + rsM.getString("subject")+ " " + rsM.getInt("marks"));
            // }
         
            // Department table
            // String selectquery = "select * from Department";
            // ResultSet rsD = stmt.executeQuery(selectquery);
            //  while (rsD.next()){
            //     System.out.println(rsD.getInt(1) + " " + rsD.getString(2) );
            //     System.out.println(rsD.getInt("did") + " " + rsD.getString("dname"));
            // }
         
            // Employee table
            String selectquery = "select * from Employee";
            ResultSet rs = stmt.executeQuery(selectquery);
             while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)+ " " +rs.getInt(5));
                System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("salary")+ " " +rs.getString("address")+ " " +rs.getInt("did"));
            }
            
            //int outputS = stmt.executeUpdate(selectquery);
            //System.out.println(outputS);
         
         //Step 5: Close connection
          System.out.println("Connection closed");
          con.close();
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            e.printStackTrace();
        }}}
