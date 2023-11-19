package CalculadoraMath;

import javax.swing.*;

public class Soma {

    public static void main(String[] args) {

       // instanciando o objeto

       CalculadoraMath1 somalarissa = new CalculadoraMath1();
       somalarissa.numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));
       somalarissa.numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));;
       somalarissa.resultado= somalarissa.numero1+ somalarissa.numero2 ;


       // chamando os métodos
        somalarissa.somar(somalarissa.resultado);
        System.out.println("A soma é: " + somalarissa.resultado);
        somalarissa.encerramento(somalarissa.msg);



    }

}
