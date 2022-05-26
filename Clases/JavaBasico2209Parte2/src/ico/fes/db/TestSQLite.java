/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.db;
import java.sql.*;

/**
 *
 * @author dannapaola
 */
public class TestSQLite {
    
    public static void main(String[] args) {
       Connection conexion = null;
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            System.out.println(System.getProperty("user.dir") + "/poo2022.db");
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");
            // stm objeto que permite hacer consultas
            Statement stm =conexion.createStatement();
            //stm.execute("CREATE TABLE prueba1(nombre VARCHAR(10) , telefono VARCHAR(15) );");
            //stm.execute(" INSERT INTO prueba1 VALUES('Diana','4455677')");
            
            ResultSet rst=stm.executeQuery("SELECT * FROM prueba1;");
            
            while (rst.next()){
                System.out.print("Nombre: "+ rst.getString(1));
                System.out.println(" Telefono: "+ rst.getString(2));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
                
    }
    
}
