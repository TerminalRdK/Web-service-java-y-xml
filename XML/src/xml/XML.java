/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

/**
 *
 * @author Dalto
 */
public class XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jxml xml=new Jxml();
        controlador ctrl=new controlador(xml);
        xml.setVisible(true);
    }
    
}
