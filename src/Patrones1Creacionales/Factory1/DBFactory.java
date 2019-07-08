package Patrones1Creacionales.Factory1;

/**
 * @author Genarogg
 */
public class DBFactory {
    public enum DBType{MySQL, Oracle, PostgreSQL}
    
    public static DBAdapter getDBAdapter(DBType dbType){
        switch(dbType){
	  case MySQL:
	      return new MySQLAdapter();
	      
	  case Oracle:
	      return new OracleAdapter();
	  case PostgreSQL:
	      return new PostgreSQLAdapter();  
	  default:
	      throw new IllegalArgumentException("accion no soportada");
        }
    }
}
