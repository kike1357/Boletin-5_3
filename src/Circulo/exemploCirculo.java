
package Circulo;

import javax.swing.JOptionPane;


public class exemploCirculo {
   

public static void main(String[] args) {
        double radio;
        String arealonxitude=JOptionPane.showInputDialog("Radio");
          radio=Double.parseDouble(arealonxitude);
          Circulo cir= new Circulo(radio);
          JOptionPane.showMessageDialog(null,"Area"+ cir.calArea());
          JOptionPane.showMessageDialog(null,"Lonxitude"+ cir.calLonxitude());
    }
    
}