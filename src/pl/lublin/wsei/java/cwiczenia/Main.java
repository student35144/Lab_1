package pl.lublin.wsei.java.cwiczenia;

public class Main {
    /**
     * comment before main()
     */
    public static void main(String[] args) {
        /*
        multiple
        line
        comment
        */

        // single line comment
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
}
