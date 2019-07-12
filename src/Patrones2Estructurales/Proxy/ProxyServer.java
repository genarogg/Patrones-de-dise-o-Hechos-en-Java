package Patrones2Estructurales.Proxy;

/**
 * @author Genarogg
 */
public class ProxyServer  implements Servidor{
    ServidorReal servidorReal;
    private String host;
    
    public ProxyServer(String host){
        this.host = host;
        servidorReal = null;
        System.out.println("Iniciando proxy...");
    }
    @Override
    public void descargar(String url) {
        if(servidorReal == null){
	  servidorReal = new ServidorReal(host);
        }
        servidorReal.descargar(url);
    }
}