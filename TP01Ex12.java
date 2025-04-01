import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume do cone: " + volume);
        scanner.close();
    }
}
