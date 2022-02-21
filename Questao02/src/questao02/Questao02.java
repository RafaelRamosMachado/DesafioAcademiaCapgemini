/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Digite seu nome de login: ");  
       Boolean verifica = false;
        while(verifica == false){
            String senha = JOptionPane.showInputDialog("Digite uma senha, ela deve conter no mínimo 6 dígitos, no mínimo"
                + " uma letra maiúscula, uma minúscula e ao menos um caracter especial: ");
            verifica =
            senha.length()>=6
        &&  Pattern.compile("[A-Z]+").matcher(senha).find()
        &&  Pattern.compile("[a-z]+").matcher(senha).find()
        &&  Pattern.compile("[0-9]+").matcher(senha).find()
        &&  Pattern.compile("!|@|#|\\$|%|\\^|&|\\*|\\(|\\)|-|\\+").matcher(senha).find(); 
            
            if(verifica == true){
                System.out.println("Seu nome de login é: " + nome+ " e sua senha está correta");
            }
        }
    }
}
