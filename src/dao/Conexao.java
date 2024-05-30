package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection conectadb(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/banco?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexão: " + erro.getMessage());
        }
        
        return conn;
    }

    public Connection getConnection() {
        return conectadb(); // Retorna a conexão estabelecida
    }
}


