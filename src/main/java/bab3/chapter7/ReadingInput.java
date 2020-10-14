package bab3.chapter7;

import java.util.*;

public class ReadingInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Input: " + name);
        name = in.next();
        System.out.println("Input: " + name);

        int iniInteger = in.nextInt();
        System.out.println("Input: " + iniInteger);
    }
}
