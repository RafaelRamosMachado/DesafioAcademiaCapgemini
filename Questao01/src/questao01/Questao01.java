/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

import javax.swing.JOptionPane;

/**
 *                                                          
 * @author USER
 */
public class Questao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        for (int i = 1; i <= num; i++){
            for(int j = num - i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}
