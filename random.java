import java.util.Random;
public class random {

    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(6)+1;   // if we want to limit the size of the number enter the limit within 
                                             // the brackets we can even add the limit after the brackets also

        System.out.println(x);
    }
    
}
