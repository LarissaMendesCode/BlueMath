package CalculadoraMath;

import javax.swing.*;

public class Divisao {

        public static void main(String[] args) {

                CalculadoraMath1 divisaoMatheus = new CalculadoraMath1();

                divisaoMatheus.numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));
                divisaoMatheus.numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));

                if (divisaoMatheus.numero2 <= 0) {
                        System.out.println("Impossível dividir por 0 ou por números negativos.");
                }
                else
                {
                        if (divisaoMatheus.numero1 <= 0)
                        {
                                System.out.println("Impossível dividir por 0 ou por números negativos.");
                        }
                        else
                        {
                                divisaoMatheus.resultado = divisaoMatheus.numero1 / divisaoMatheus.numero2;
                        System.out.println("A divisão é: " + divisaoMatheus.resultado);

                        divisaoMatheus.encerramento(divisaoMatheus.msg);
                        }
                }
}
}
