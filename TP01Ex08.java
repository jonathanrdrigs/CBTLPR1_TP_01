import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de milhas marítimas: ");
        double milhas = scanner.nextDouble();
        double quilometros = milhas * 1.852;
        System.out.println("Equivalente em quilômetros: " + quilometros);
        scanner.close();
    }
}
