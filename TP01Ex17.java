import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();
        double resultado = Math.pow(x, y);
        System.out.println("Resultado de X^Y: " + resultado);
        scanner.close();
    }
}
