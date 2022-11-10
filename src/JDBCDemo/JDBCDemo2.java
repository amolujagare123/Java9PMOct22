package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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
     // DDL-->
        String sql = "select * from student;";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


        st.close();
        con.close();

    }
}
