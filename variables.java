
public class variables {
    static int a = 20;// Static variable
    int d = 50;

    class student {
        int b = 30;// Local variable

    }

    public static void main(String[] args) {
        int c = 40;// Instance variable
        System.out.println(c);
        // System.out.println(b);
        variables outerobj = new variables();
        student innerobj = outerobj.new student();
        System.out.println(innerobj.b);
        System.out.println(outerobj.d);
    }
}
