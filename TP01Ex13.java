import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial (m/s): ");
        double vi = scanner.nextDouble();
        System.out.print("Digite a aceleração (m/s²): ");
        double a = scanner.nextDouble();
        System.out.print("Digite o tempo (s): ");
        double t = scanner.nextDouble();
        double vf = vi + (a * t);
        System.out.println("Velocidade final (km/h): " + (vf * 3.6));
        scanner.close();
    }
}
