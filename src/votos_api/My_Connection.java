/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package votos_api;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;

/**
 *
 * @author yasmi
 */
public class My_Connection {

    private static String username = "root";
    private static String dbName = "votos_api_db";
    private static Integer portnumber = 3306;
    private static String password = "";
    private static String servername = "localhost";

    public static Connection getConnection() {

        Connection con = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portnumber);

        try {
            con = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(My_Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return con;
    }

}
