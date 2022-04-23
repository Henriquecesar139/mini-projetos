import java.util.Scanner;

class Main {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
          }

    }  
}