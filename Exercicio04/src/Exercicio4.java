// TODO code application logic here
    import javax.swing.JOptionPane;

public class Exercicio4 {
    public static String comMaisVogais(String[] palavras) {
        String resultado = "";
        int max = 0;
        for (String palavra : palavras) {
            int contador = 0;
            for (char c : palavra.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) contador++;
            }
            if (contador > max) {
                max = contador;
                resultado = palavra;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite palavras separadas por vírgula:");
        String[] palavras = entrada.split(",");
        JOptionPane.showMessageDialog(null, "Com mais vogais: " + comMaisVogais(palavras));
    }
}

