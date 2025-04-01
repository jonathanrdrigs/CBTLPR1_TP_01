import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor do " + i + "º produto: ");
            total += scanner.nextDouble();
        }
        System.out.print("Digite o valor pago: ");
        double pago = scanner.nextDouble();
        double troco = pago - total;
        System.out.println("Troco: R$ " + troco);
        scanner.close();
    }
}
