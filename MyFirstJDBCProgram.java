import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class MyFirstJDBCProgram {
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
         String createquery = "create table Student(sid int primary key, sname varchar(20), city varchar(20))"; 
         int output = stmt.executeUpdate(createquery);
         String pstmtInsertSql = "insert into  student values(?,?,?)"; // Prepared Statement Insert Query
         PreparedStatement pstmt =  con.prepareStatement(pstmtInsertSql);
         pstmt.setInt(1,16);
         pstmt.setString(2,"vivek");
         pstmt.setString(3,"Delhi");
        //Step 4: Execute statement
         int r = pstmt.executeUpdate();
         System.out.println(r);
         //int output = stmt.executeUpdate(query);
         //String insertquery = "insert into Student values(1,'Ram','hubli')"; // Rishab
         String insertquery = "insert into Student values(2,'Sita','hubli')"; // Akash
         int output = stmt.executeUpdate(insertquery);
        String selectquery = "select * from Student";
        //int output = stmt.executeUpdate(selectquery); // OR
        // System.out.println(output);
        //boolean success = stmt.execute(selectquery);  // OR
        //System.out.println(success);
        ResultSet rs = stmt.executeQuery(selectquery);  // Scrollable Statement Select Query
        while (rs.next()){
           System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
           System.out.println(rs.getInt("sid") + " " + rs.getString("sname") + " " + rs.getString("city"));
       }
        //Step 5: Close connection
        System.out.println("Connection closed");
        con.close();
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            e.printStackTrace();
        }}}
