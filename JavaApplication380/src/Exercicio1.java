import javax.swing.JOptionPane;

public class Exercicio1 {
    public static boolean ehPerfeito(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma == numero;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        JOptionPane.showMessageDialog(null, numero + (ehPerfeito(numero) ? " é perfeito." : " não é perfeito."));
    }
}

