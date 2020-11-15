package Tools;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Tools tools = new Tools();
        while (true) {
            System.out.println("Please input the num you want to choose");
            System.out.println("1.SimpleCircle");
            System.out.println("2.countNum");
            System.out.println("3.Fibonacci");

            int opt = cin.nextInt();
            if (opt == 1) {
                System.out.println("Please input the num you want to calculate");
                int num = cin.nextInt();
                System.out.println("The answer is " + tools.simpleCircle(num));
            } else if (opt == 2) {
                System.out.println("Please input the num you want to calculate");
                int num = cin.nextInt();
                System.out.println("The answer is " + tools.countNum(num));
            } else if (opt == 3) {
                System.out.println("Please input the num you want to calculate");
                int num = cin.nextInt();
                System.out.println("The answer is " + tools.Fibonacci(num));


            }
        }

    }
}