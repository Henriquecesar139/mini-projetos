import java.util.Scanner;

class Main {  
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        int altura = input.nextInt();
        System.out.println("Digite a largura: ");
        int largura = input.nextInt();

        System.out.printf("A área dsse retângulo é %d\n", altura * largura);

        input.close();
    }  
}