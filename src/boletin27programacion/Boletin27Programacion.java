
package boletin27programacion;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Brais Núñez
 */
public class Boletin27Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ventana ven1 = new Ventana();
        ven1.setVisible(true);
        ven1.setLocationRelativeTo(null);
        ven1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
