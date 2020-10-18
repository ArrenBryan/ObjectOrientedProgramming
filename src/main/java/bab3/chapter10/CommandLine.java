package bab3.chapter10;

import java.util.*;

public class CommandLine {

    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h")) {
            System.out.println("help");
            return;
        }
        System.out.println(Arrays.toString(args));
    }
}
