package bab3.chapter7;

import java.util.*;

public class FormattingOutput {

    public static void main(String[] args) {
        System.out.print(12.1234567);
        System.out.printf("\n%e\n", 12.12345678998);
        System.out.printf("\n%f", 12.1234567);
        System.out.printf("%.0f\n", 12.1234567);
        System.out.printf("%.2f\n", 12.1234567);
        System.out.printf("%1f\n", 12.1234567);
        System.out.printf("%4.3f\n", 12.1234567);
        System.out.printf("%(.4e\n\n", -12.1234567);

        System.out.printf("%tA, %tB %te, %tY | %tr\n",
                new Date(), new Date(), new Date(), new Date(), new Date());

        System.out.printf("%tA, %<tB %<te, %<tY | %<tr\n",
                new Date());

        String name = "Bryan";
        int age = 20;
        String iniString = String.format("Hello, %s. Next year, you'll be %d", name, (age + 1));
        System.out.println(iniString);
    }
}
