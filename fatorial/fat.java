import java.util.Scanner;

class Main {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = input.nextInt();
        input.close();
        int n2 = n;
        int fat = 1;

        for (int c = n; c > 0; c--) {
            fat = fat * n;
            n--;
        }

        System.out.printf("%d! = %d", n2, fat);
    }  
}