import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o diâmetro da esfera: ");
        double diametro = scanner.nextDouble();
        double raio = diametro / 2;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da esfera: " + volume);
        scanner.close();
    }
}
