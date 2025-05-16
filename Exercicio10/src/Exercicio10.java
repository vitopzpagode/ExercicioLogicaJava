
  import javax.swing.JOptionPane;

public class Exercicio10 {
    public static boolean ehFibonacci(int numero) {
        int a = 0, b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return numero == b || numero == 0;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        JOptionPane.showMessageDialog(null, numero + (ehFibonacci(numero) ? " pertence à sequência de Fibonacci." : " não pertence à sequência de Fibonacci."));
    }
}

