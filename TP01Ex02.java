import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a aresta do quadrado: ");
        double aresta = scanner.nextDouble();
        double area = aresta * aresta;
        System.out.println("Área do quadrado: " + area);
        scanner.close();
    }
}

