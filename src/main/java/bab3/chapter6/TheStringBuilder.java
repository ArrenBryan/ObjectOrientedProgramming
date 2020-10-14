package bab3.chapter6;

public class TheStringBuilder {

    public static void main(String[] args) {
        String iniString = "";
        long start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            iniString += "hello";
        }

        System.out.println("String's time: " + (System.currentTimeMillis() - start));

        System.out.println();

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("hello");
        }

        System.out.println("StringBuilder's time: " + (System.currentTimeMillis() - start));
    }
}
