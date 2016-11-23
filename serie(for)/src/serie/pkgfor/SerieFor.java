/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie.pkgfor;

import javax.swing.JOptionPane;
import seire.modelo_serie;

/**
 * 
 *
 * @author usuario
 */
public class SerieFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int l;
        double a,b,n;
        l=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite: "));
        a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b: "));
        n=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de n: "));
        modelo_serie objeto=new modelo_serie(l, a, b, n);
        objeto.serie_suma();
    }
    
}
