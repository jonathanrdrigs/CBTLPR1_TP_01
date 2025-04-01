import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o diâmetro do círculo: ");
        double diametro = scanner.nextDouble();
        double raio = diametro / 2;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);
        scanner.close();
    }
}
