/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Xogo {
    
    public void adivinar(){
        int numAdivinar;
        do {
            numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Número a adiviñar"));
        } while (numAdivinar < 1 || numAdivinar > 50);
        
        int numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos"));
        
        for (int i = 0; i < numIntentos; i++) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Intenta un número"));
        
        if (numAdivinar < num1) {
            JOptionPane.showMessageDialog(null, "O número a adiviñar é menor");
        } else if (numAdivinar > num1) {
            JOptionPane.showMessageDialog(null, "O número a adiviñar é maior");
        } else {
            JOptionPane.showMessageDialog(null, "¡Has acertado!");
            break;
        }
    }
    }
}
