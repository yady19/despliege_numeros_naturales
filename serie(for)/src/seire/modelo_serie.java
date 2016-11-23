/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seire;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class modelo_serie {
    public int l;
    public double a,b,n;

    public modelo_serie(int l, double a, double b, double n) {
        this.l = l;
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
    
    public void serie_suma(){
        double r=0;
        for (int i=1; i<=this.l; i++){
            if (i==1){
                r=r+(1/this.a);
            }
            else{
                r=r+(1/(this.a+(this.n*this.b)));
                this.n=this.n+1;
            }
        }
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: "+r);
    }
    
}
