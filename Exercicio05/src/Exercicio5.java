// TODO code application logic here
   import javax.swing.JOptionPane;

public class Exercicio5 {
    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        JOptionPane.showMessageDialog(null, "Fatorial: " + fatorial(numero));
    }
}
