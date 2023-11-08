/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provaescola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author eliria
 */
public class Conexao {
    private static final String DATABASE = "jdbc:mysql://localhost:3306/bd_escola";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection createConnectionMysql() throws Exception {
        Connection con = DriverManager.getConnection(DATABASE, USER, PASSWORD);
        return con;
    }
    
    public static void main(String[] args) throws Exception{
        Connection con = createConnectionMysql();
        
        if(con != null){
            JOptionPane.showMessageDialog(null, "Conexao obtida com sucesso!");
            con.close();
        }
    }
}
