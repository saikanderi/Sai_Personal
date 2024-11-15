public class wrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;   // Autoboxing       // Integer is an wrapper class of int ---> it is just an references to the objects
        int c = b;       // Auto Unboxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
