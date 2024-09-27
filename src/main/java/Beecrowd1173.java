
import java.util.Scanner;

public class Beecrowd1173 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int N[] = new int[10];
        
        N[0] = scanner.nextInt();
        System.out.println("N[0] = "+N[0]);
        for(int i = 1;i<10;i++){
            N[i] = N[i-1]*2;
            System.out.printf("N[%d] = %d%n", i,N[i]);
        }
    }
}
