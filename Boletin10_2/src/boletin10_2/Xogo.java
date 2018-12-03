/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Xogo {

    public void adivinar() {
        Random numaleatorio = new Random();
        int numAdivinar = 1 + numaleatorio.nextInt(50);

        int numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos"));

        for (int i = 0; i < numIntentos; i++) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Intenta un número"));

            if (numAdivinar == num1) {
            JOptionPane.showMessageDialog(null, "¡Has acertado!");
            break;
            } else if (Math.abs(numAdivinar - num1) <= 5) {
                JOptionPane.showMessageDialog(null, "Moi preto");
            } else if (Math.abs(numAdivinar - num1) <= 10) {
                JOptionPane.showMessageDialog(null, "Preto");
            } else if (Math.abs(numAdivinar - num1) <= 20) {
                JOptionPane.showMessageDialog(null, "Lonxe");
            } else if (Math.abs(numAdivinar - num1) > 20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            }
        }
    }
}
