package simulacion;

import javax.swing.JOptionPane;

public class Simulacion {

    public static boolean esPrimo(double num) {

        int contador = 0;
        for (int i = 0; i <= num; i++) {
            if ((num % i) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esImpar(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
//
    public static void main(String[] args) {

        double resul = Math.pow(2, 32);
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
        while (esImpar(a) == false || a % 3 == 0 || a % 5 == 0 ) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde a un numero impar o no debe ser divisible para 3 o 5");
            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
        }        
        double c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c"));
        while(c%8!=5){
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
            c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c"));
        }        
        double x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la semilla"));;
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del modulo"));
        while ((esPrimo(m) == false && m < resul ) || m<a ||m<c||m<x) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde a un numero primo o no es aceptado por el computador");
            m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del modulo"));                 
        }
       
        
       
        
        double r = 0;
        double d = 0;
        double num = 0;     
        String aux ="";
                
        for (int i = 1; i <= m; i++) {
            d = ((a * x) + c) / m;
            r = ((a * x) + c) % m;
            num = r / m;        
            
            aux = aux + (" | "+i + " |  " + x + "  |  "  + d + "     |  " + r + "    |  " + num +" |"+ "\n");
            
            x = r;
        }

        JOptionPane.showMessageDialog(null, " n     " +"Xn   "+"(aXn+c)"+"    Xn+1"+"  Numeros uniformes\n"+ aux);
    }

}
