package CalculadoraMath;

import javax.swing.*;

public class CalculadoraMath1 {

    //ATRIBUTOS
    double numero1, numero2;
    double resultado;
    int operacao;
    boolean condiction = true;
    double soma;
    double sub;
    double mult;
    double div;

    String msg;


//métodos
    void somar (double resultadosom) {
      resultadosom= numero1+numero2;
      resultado = resultadosom;
    }
    void encerramento ( String msg ) {
         System.out.println("Obrigada por utilizar a Calculadora, até logo");

    }

}




