import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello BlueCalculator");

        Double numero1, numero2;


        int tipo;
        boolean condiction = true;

        while (condiction) {
            tipo = Integer.parseInt(JOptionPane.showInputDialog("""
                    Selecione a operação desejada:
                    1. Soma
                    2. Subtração
                    3. multiplicação
                    4. Divisão
                    5. Sair"""


            ));

            switch (tipo) {

                case (1) -> {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com outro número"));
                    double soma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "A Soma é = " + soma);
                }
                case (2) -> {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com outro número"));
                    double sub = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "A Subtração é = " + sub);
                }
                case (3) -> {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com outro número"));
                    double multiplic = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "A Multiplicação é = " + multiplic);
                }

                case (4) -> {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com um número"));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresse com outro número"));
                    if (numero2 == 0) {
                        JOptionPane.showMessageDialog(null, "Não se pode dividir por 0. Informe outro número.");
                    } else {
                        double div = numero1 / numero2;
                        JOptionPane.showMessageDialog(null, "A Divisão é = " + div);
                    }
                }
                case (5) -> {
                    condiction=false;
                    JOptionPane.showMessageDialog(null, "Operação encerrada, até logo!");
                }



            }





        }

    }
}


