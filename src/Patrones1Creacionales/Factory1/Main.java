package Patrones1Creacionales.Factory1;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Genarogg
 * 
 * El patron factory esta para fabricar o construir objetos
 * --Es comunmente usado cuando se tiene que crear un objeto pero no se 
 *   cual objeto
 * 
 * ***CLASE SOLO DEMOSTRATIVA***
 */
public class Main {
    public static void main(String[] args) throws SQLException{
        try {
            DBAdapter abAdapter = DBFactory.getDBAdapter(DBFactory.DBType.MySQL);
            Connection coneccion = abAdapter.getConnection();
        
            Statement statement = coneccion.createStatement();
            statement.execute("SELECTO * FROM XXXXX");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Termino la prueba");
        }
        
        
    
    }
}