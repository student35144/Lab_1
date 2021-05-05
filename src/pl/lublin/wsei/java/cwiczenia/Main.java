package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1 = 0, num2 = 0;
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 != 0)
            {
                System.out.print("Podaj drugą liczbę: ");
                num2 = input.nextInt();
            }
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while ((num1 != 0)&&(num2 != 0));


        int num3 = 0, num4 = 0;
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            num3 = input.nextInt();
            if (num3 == 0) break;
            System.out.print("Podaj drugą liczbę: ");
            num4 = input.nextInt();
            if (num4 == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num3, num4, num3 + num4);
        } while (true);


        int num5 = 0, num6 = 0;
        do {
            System.out.print("Podal liczby, które mam dodać: ");
            num5 = input.nextInt();
            num6 = input.nextInt();
            if ((num5 == 0) || (num6 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num5, num6, num5 + num6);
        } while (true);
    }
}
