public class FunctionsMethods {
    public static void main(String[] args) {
        
        String greeting = greet("Sai");
        System.out.println(greeting);

    }

    static String greet(String name)
    {
        String message = "Hello " + name;
        return message;
    }
}

