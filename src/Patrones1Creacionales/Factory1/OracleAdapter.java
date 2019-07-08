package Patrones1Creacionales.Factory1;

import java.sql.Connection;

/**
 * @author Genarogg
 */
public class OracleAdapter implements DBAdapter{
    @Override
    public Connection getConnection() {
        Connection connection = null;
        return connection;
    }   
}