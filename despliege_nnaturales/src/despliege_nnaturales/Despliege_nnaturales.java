/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despliege_nnaturales;

import javax.swing.JOptionPane;
import n_naturales.modelo_n_naturales;

/**
 *
 * @author usuario
 */
public class Despliege_nnaturales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int l;
        l=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite: "));
        modelo_n_naturales objeto=new modelo_n_naturales(l);
        objeto.serie();
    }
    
}
