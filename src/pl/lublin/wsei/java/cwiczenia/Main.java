package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        zad12();
    }

    public static void zad7()
    {
        System.out.println("Hello Java world\n");

        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");

        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        int a = 3;
        double b = 4.21;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %f, s = %s %n", a, b, s);

        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);

        System.out.printf(" Nazywaliśmy to \"witaminą B3\"");

        System.out.printf("alfa\tsin (alfa)\n");
        for (int i = 0; i < 370; i+=10)
        {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }

        System.out.printf("arg\tlog2(arg)\t sum(arg)\n");
        int sum = 0;
        for (int i = 1; i <= 16; i = i*2)
        {
            System.out.printf("%d\t%f\t%d\n", i, Math.log(i)/Math.log(2), sum = sum+i);
        }
    }

    public static void zad8i9()
    {
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
            System.out.print("Podaj liczby, które mam dodać: ");
            num5 = input.nextInt();
            num6 = input.nextInt();
            if ((num5 == 0) || (num6 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num5, num6, num5 + num6);
        } while (true);
    }

    public static void zad10()
    {
        Scanner input = new Scanner(System.in);

        int num;
        do {
            System.out.print("Podaj liczbę: ");
            num = input.nextInt();

            String bin = Integer.toBinaryString(num);
            String hex = Integer.toHexString(num).toUpperCase();

            System.out.printf("DEC = %d, BIN = %s, HEX = %s\n\n", num, leftPad(Integer.toBinaryString(num),"0",8),
                    "0x" + leftPad(Integer.toHexString(num).toUpperCase(),"0",8));
        } while (true);
    }

    public static String leftPad(String numText, String numChar, int numWidth)
    {
        String num = numText;
        for (int i=0; i<numWidth-numText.length(); i++)
            num = numChar + num;
        return num;
    }

    public static void zad11()
    {
        int[] liczby = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        long avg = 0;
        for (int l:liczby)
        {
            System.out.println(l);
            if (l < min) min = l;
            if (l > max) max = l;
            avg += l;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", min, max, (float)avg/liczby.length);
    }

    public static void zad12()
    {
        Account acc = new Account();
        acc.setName("michał Czaja");
        System.out.println(acc.getName());

        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.translit("Adam Nowak"));
        System.out.printf("%s%n",Account.translit("Michał Czaja"));
    }
}
