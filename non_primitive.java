public class non_primitive {
    
    int x;
    int y;

    @SuppressWarnings("unused")
class test
    {
        public static void main(String[] args) {
            non_primitive n = new non_primitive();

            n.x = 10;
            n.y = 20;

            System.out.println("X :"+n.x+" Y : "+n.y);
        }
    }
    
}
