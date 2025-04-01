import java.util.Scanner;

// CBTLPR1_TP_01 - Jonathan Rodrigues Feitosa e Leonardo Pereira Pedroso
public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a resistência (ohms): ");
        double resistencia = scanner.nextDouble();
        System.out.print("Digite a corrente (amperes): ");
        double corrente = scanner.nextDouble();
        double tensao = resistencia * corrente;
        System.out.println("Tensão (volts): " + tensao);
        scanner.close();
    }
}
