
 import javax.swing.JOptionPane;

public class Exercicio3 {
    public static int maiorAbsoluto(int[] array) {
        int maior = 0;
        for (int n : array) {
            if (Math.abs(n) > Math.abs(maior)) {
                maior = n;
            }
        }
        return Math.abs(maior);
    }

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite números separados por vírgula:");
        String[] partes = entrada.split(",");
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }
        JOptionPane.showMessageDialog(null, "Maior valor absoluto: " + maiorAbsoluto(numeros));
    }
}
