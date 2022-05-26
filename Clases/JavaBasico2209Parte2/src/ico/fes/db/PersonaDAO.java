/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.db;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import org.sqlite.SQLiteException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dannapaola
 */
public class PersonaDAO implements interfazDao {

    @Override
    public ArrayList obtenerTodo() throws SQLiteException {
        ArrayList<Persona> info = new ArrayList<Persona>();
        try {
            // Conectarse base de datos
            Statement stm = BaseDeDatos.getInstance().getConexion().createStatement();

            ResultSet rst = stm.executeQuery("SELECT * FROM prueba1;");

            while (rst.next()) {
                info.add(new Persona(rst.getString(1), rst.getInt(2)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return info;

    }

    @Override
    public boolean insertar(Object o) throws SQLiteException {
        Persona p = (Persona) o;
        boolean respuesta= false;
        
        String sql = "INSERT INTO persona VALUES(?,?) ";
        try {
            PreparedStatement pstm = BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
            pstm.setString(1,p.getNombre());
            pstm.setInt(2,p.getEdad());
            int rowCount= pstm.executeUpdate();
            respuesta =rowCount==1? true:false;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return respuesta;
    }

    @Override
    public boolean eliminar(String n) throws SQLiteException {
        return true;
    }

}
