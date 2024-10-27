import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean pertenceFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }
        
        int a = 0, b = 1;
        
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == numero || a == numero;
    }
}
