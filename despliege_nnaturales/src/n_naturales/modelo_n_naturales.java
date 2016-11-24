/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_naturales;

/**
 *
 * @author usuario
 */
public class modelo_n_naturales {
    public int l;

    public modelo_n_naturales(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    public void serie(){
        int n=1;
        for (int i=1; i<=this.l; i++){
            for (int j=1; j<=i; j++){
                //pint me permite inprimir en una sola linea
                System.out.print(n+"    ");
                n+=1;
            }
            //println me permite imprimir haciendo el salto de linea
            System.out.println();
        }
    }
}
