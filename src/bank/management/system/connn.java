package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connn {
        Connection connection;
        Statement statement;
        public connn() {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "mysql2026");
                statement = connection.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
}
