import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
        scanner.close();
    }
}
