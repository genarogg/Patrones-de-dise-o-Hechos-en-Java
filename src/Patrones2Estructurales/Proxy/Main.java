package Patrones2Estructurales.Proxy;

/**
 * @author Genarogg
 * 
 * El patrón Proxy es un patrón estructural que tiene 
 * como propósito proporcionar un subrogado o 
 * intermediario de un objeto para controlar su acceso.
 */
public class Main {
    public static void main(String[] args) {
        Servidor servidor = new ProxyServer("miSitio.com");
        servidor.descargar("loquesea");
    }
}