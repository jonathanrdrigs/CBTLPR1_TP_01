import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            soma += scanner.nextDouble();
        }
        System.out.println("Média aritmética: " + (soma / 4));
        scanner.close();
    }
}
