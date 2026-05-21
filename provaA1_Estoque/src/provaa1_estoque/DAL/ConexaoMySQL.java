/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaa1_estoque.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author danilotavareslima
 */
public class ConexaoMySQL {

    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String SQL;

    public void abrirBD() throws Exception {
        
        java.util.Properties props = new java.util.Properties();

        try (java.io.FileInputStream file = new java.io.FileInputStream("config.properties")) {
            props.load(file);
        } catch (Exception e) {
            throw new Exception("Arquivo config.properties não encontrado. Crie ele na raiz do projeto!");
        }

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = props.getProperty("DB_URL");
        String user = props.getProperty("DB_USER");
        String password = props.getProperty("DB_PASS");

        con = DriverManager.getConnection(url, user, password);
    }

    public void fecharBD() throws Exception {

        if (con != null) {
            con.close();
        }
    }
}
