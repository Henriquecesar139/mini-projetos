import java.util.Scanner;

class Main {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        input.close();
        int mult = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                mult++;        
            }
        }

        if (mult == 0) {
            System.out.println("É primo\n");
        } else {
            System.out.println("Não é primo\n");
        }

    }  
}  