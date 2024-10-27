import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String original = scanner.nextLine();
        char[] caracteres = original.toCharArray();
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        String invertida = new String(caracteres);
     
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}
