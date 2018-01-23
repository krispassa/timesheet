package io.timesheet.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AmazonConn {

	public static void main(String[] args) {
		String databaseURL = "jdbc:mysql://mycollection-db.cw0za9eki65f.us-east-1.rds.amazonaws.com/StudentDB";
        String user = "mycollection_db";
        String password = "mycollection_db2";
        Connection conn = null;
        String name;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(databaseURL, user, password);
            if (conn != null) 
            {
            	Statement st = conn.createStatement();
                String query = "select * from employee where eid=1";
                ResultSet result = st.executeQuery(query);
                if (!result.next()) {
                    name = "Couldn't get Name from Database";
                    
                } else {
                    name = result.getString("first_name") + " " + result.getString("last_name") + " "+ result.getString("address");
                }
                st.close();
                System.out.println("Connected to the database");
                System.out.println(name);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not find database driver class");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
	}

}
