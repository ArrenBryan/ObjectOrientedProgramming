package bab3.chapter6;

public class CodePoints {

    public static void main(String[] args) {
        String sentence = "𝑖 is set of octonions";
        System.out.println(sentence + "\n");

        for (int i = 0; i < sentence.length();) {
            int cp = sentence.codePointAt(i);
            if (Character.isSupplementaryCodePoint(cp)) {
                System.out.println("" + sentence.charAt(i) + sentence.charAt(i+1));
                i += 2;
            } else {
                System.out.println(sentence.charAt(i));
                i++;
            }
        }
    }
}
