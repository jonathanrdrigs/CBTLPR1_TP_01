import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double x = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double y = scanner.nextDouble();
        double mediaGeometrica = Math.sqrt(x * y);
        System.out.println("Média geométrica: " + mediaGeometrica);
        scanner.close();
    }
}
