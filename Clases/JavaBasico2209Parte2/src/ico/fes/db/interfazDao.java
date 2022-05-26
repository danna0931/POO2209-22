/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.db;

import java.util.ArrayList;
import org.sqlite.SQLiteException;

/**
 *
 * @author dannapaola
 */
public interface interfazDao {
    
    public abstract ArrayList obtenerTodo() throws SQLiteException ;
    public abstract boolean insertar(Object o) throws SQLiteException ;
    public abstract boolean eliminar(String n) throws SQLiteException ;
    
    
}
