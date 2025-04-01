import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();
        double area = (diagonal * diagonal) / 2;
        System.out.println("Área do quadrado: " + area);
        scanner.close();
    }
}

