
   import javax.swing.JOptionPane;

public class Exercicio8 {
    public static int[] inverter(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite números separados por vírgula:");
        String[] partes = entrada.split(",");
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }
        int[] invertido = inverter(numeros);
        String resultado = "";
        for (int n : invertido) {
            resultado += n + " ";
        }
        JOptionPane.showMessageDialog(null, "Array invertido: " + resultado.trim());
    }
}
