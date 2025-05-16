
   import javax.swing.JOptionPane;

public class Exercicio9 {
    public static double calcularPorcentagem(double total, double porcentagem) {
        return total * (porcentagem / 100);
    }

    public static void main(String[] args) {
        double total = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total:"));
        double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem:"));
        double resultado = calcularPorcentagem(total, porcentagem);
        JOptionPane.showMessageDialog(null, porcentagem + "% de " + total + " = " + resultado);
    }
}

