import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        int n = input.nextInt();
        input.close();
        int t1 = 0;
        int t2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(t1 + "\n");
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
    }
}