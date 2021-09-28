public class DSwitch {
    public static void main(String[] args) {
        char ch = 'A';
        final char x = 66;
        switch (ch) {
            case 65:
                System.out.println(((Object)ch).getClass().getSimpleName());
                System.out.println(ch);
                break;
            case x:
                System.out.println(((Object)ch).getClass().getSimpleName());
            default:System.out.println("Default.");
        }
    }
}
