// TODO code application logic here
   import javax.swing.JOptionPane;

public class Exercicio7 {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        JOptionPane.showMessageDialog(null, "MDC: " + mdc(a, b));
    }
}

