package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user ="hbstudent";
        String pass = "hbstudent";
        try {
            System.out.println("Connecting to database: "+ jdbcURL);

            Connection conn = DriverManager.getConnection(jdbcURL, user, pass);

            System.out.println("Connection Successful");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
