import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double r = scanner.nextDouble();
        System.out.print("Digite a aresta do cubo: ");
        double a = scanner.nextDouble();
        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double volumeCubo = Math.pow(a, 3);
        double volumeLivre = volumeCubo - volumeEsfera;
        System.out.println("Volume livre: " + volumeLivre);
        scanner.close();
    }
}
