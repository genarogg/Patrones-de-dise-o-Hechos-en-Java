package Patrones1Creacionales.Factory1;

import java.sql.Connection;
/**
 * @author Genarogg
 */
public interface DBAdapter {
    Connection getConnection();
}