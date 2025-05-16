
 import javax.swing.JOptionPane;

public class Exercicio6 {
    public static boolean ehPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(texto).reverse().toString().equals(texto);
    }

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra ou frase:");
        JOptionPane.showMessageDialog(null, (ehPalindromo(texto) ? "É palíndromo." : "Não é palíndromo."));
    }
}
