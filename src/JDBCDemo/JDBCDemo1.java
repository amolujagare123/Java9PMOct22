package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // 1. Loading a driver (https://dev.mysql.com/downloads/connector/j/ )
        Class.forName("com.mysql.cj.jdbc.Driver");

    // 2. Creating a connection
        String username="root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/9pmbatch";
        Connection con = DriverManager.getConnection(url,username,password);

    // 3. Creating statements
        Statement st = con.createStatement();

    // 4. Executing the query - DML(data manipulation language) / DDL (data definition language)
     // DML -->
        //String sql = "insert into student values(4,'vishal','IT',90)";
        String sql = "update student set marks=100 where rno=4";
        st.executeUpdate(sql);


        st.close();
        con.close();

    }
}
