import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();
        double radianos = Math.toRadians(graus);
        System.out.println("Seno: " + Math.sin(radianos));
        System.out.println("Cosseno: " + Math.cos(radianos));
        System.out.println("Tangente: " + Math.tan(radianos));
        System.out.println("Secante: " + (1 / Math.cos(radianos)));
        scanner.close();
    }
}
