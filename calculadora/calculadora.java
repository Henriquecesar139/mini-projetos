import java.util.Scanner;

class Main {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = input.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = input.nextInt();
        
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
        System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);

        input.close();
    }  
}