package edu.escuelaing.arep.app;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class UrlReader1 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        URL google = new URL("http://campusvirtual.escuelaing.edu.co:8080/moodle/mod/assign/view.php?id=34731#app");
        System.out.println("Protocol "+ google.getProtocol());
        System.out.println("Authority "+ google.getAuthority());
        System.out.println("Host "+ google.getHost());
        System.out.println("Port "+ google.getPort());
        System.out.println("Path "+ google.getPath());
        System.out.println("Query "+ google.getFile());
        System.out.println("Ref "+ google.getRef());
        
    }
}
