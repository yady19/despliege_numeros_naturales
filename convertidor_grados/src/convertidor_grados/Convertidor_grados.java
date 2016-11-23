/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor_grados;

import grados.modelo_grados;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Convertidor_grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: "+"\n1) Fahrenheit a Centígrados.\n2) Centígrados a Fahrenheit."));
        } while (op<=0 || op>=3);
        modelo_grados objeto=new modelo_grados(op);
        objeto.convertidor();
    }
    
}
