package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCIntro {
    /*
    connection -> itwill connect us to database
    statement - we are goingbto defined our conditions yo get result from db
    resultsSet - we store the datta fromdata base into to java object
    three above of the interfaces in java whcih come from jdbc

     */
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@nisabashir.cc3y8dmo6yui.us-east-2.rds.amazonaws.com:1521/ORCL","nisa"
                ,"Mai5338670!");
    }
}
