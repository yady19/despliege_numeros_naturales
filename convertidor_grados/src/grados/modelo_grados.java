/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class modelo_grados {
    int op;

    public modelo_grados(int op) {
        this.op = op;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
    
    public void convertidor(){
        double c=0;
        double gf=0;
        double gc=0;
        switch (this.op){
            case 1:
                //pido que ingrese un grado Fahrenheit
                gf=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un grado Fahrenheit: "));
                //lo convierto mediante la siguiente formula
                c=(gf*9/5)+32;
                //lo presento
                JOptionPane.showMessageDialog(null, "El total de la conversion de grados Fahrenheit a grados Centígrados es de: "+c);
                break;
            case 2:
                //pido que ingrese un grado Centígrado
                gc=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un grado Centígrados: "));
                //la convierto mediante la siguente formula
                c=(gc-32)*5/9;
                //lo presento
                JOptionPane.showMessageDialog(null, "El total de la conversion de grados Centígrados a grados Fahrenheit es de: "+c);
                break;
        }
    }
    
}
