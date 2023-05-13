public class widening {
    public static void main(String[] args) {
        int a = 30;
        float b = a;// widening
        System.out.println(a);
        System.out.println(b);

        // Type casting

        float f = 10.5f;
        // int a = f;//it will give an error coz it cant convert float into int so we
        // have to type cast it..
        int c = (int) f;
        System.out.println(c);

        // int to byte
        int g = 2000;
        byte d = (byte) g;
        System.out.println(d);

    }

}
