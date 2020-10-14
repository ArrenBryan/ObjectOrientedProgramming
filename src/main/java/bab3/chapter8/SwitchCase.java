package bab3.chapter8;

public class SwitchCase {

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE;
    }

    public static void main(String[] args) {
        Size size = Size.LARGE;

        switch (size) {
            case SMALL: // tidak perlu menulis "Size.SMALL"
                System.out.printf("%s adalah kecil\n", size);
                break;
            case MEDIUM:
                System.out.printf("%s adalah sedang\n", size);
                break;
            case LARGE:
                System.out.printf("%s adalah besar\n", size);
                break;
        }
    }
}
