import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int lado1 = input.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = input.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = input.nextInt();
        input.close();

        if (lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado1 + lado3 < lado2) {
            System.out.println("Não é um triângulo\n");
        }
        
        else if(lado1 == lado2 && lado1 == lado3) {
            System.out.println("Equilátero\n");
        }
    
        else if(lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
            System.out.println("Isósceles\n");
        }
    
        else {
            System.out.println("Escaleno\n");
        }
        
    }
}