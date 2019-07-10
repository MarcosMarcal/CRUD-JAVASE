/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcal
 */
public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/crud";
    private static final String USER = "marcal";
    private static final String PASS = "";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Falha ao tentar conectar!", ex);
        }

    }

    public static void closeConnection(Connection con) {

        try {
            if (con != null) {
                con.close();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão");
        }

    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        try {
            if (stmt != null) {
                stmt.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão");
        }
        

    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão");
        }
        
        closeConnection(con, stmt);

    }
}
