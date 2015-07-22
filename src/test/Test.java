/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


/**
 *
 * @author Honza
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String email;
        UrlProvider neco= new UrlProvider();
        Name name = new Name(args[0]);
        String url = name.getNameAdress();
        
        UrlProvider p = new UrlProvider();
        System.out.println(p.readUrl(url));
    }
    
}
