import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();
        System.out.print("Digite a quantidade de dólares: ");
        double dolares = scanner.nextDouble();
        double reais = dolares * cotacao;
        System.out.println("Valor em reais: R$ " + reais);
        scanner.close();
    }
}
