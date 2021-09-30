package tp1;

/**
 *
 * @author dityath
 */
public class SecondQuestion {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        for(int i = 2; i < 11; i++) {
            System.out.printf("%d ", recursive(i));
        }
    }
    
    private static int recursive(int x) {
        if (x < 2) return x;
        return recursive(x - 2) + recursive(x - 1);
    }

}
