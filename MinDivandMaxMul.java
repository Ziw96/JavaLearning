import java.util.Scanner;
public class MinDivandMaxMul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input the first number:");
        int n1 = scan.nextInt();
        System.out.println("input the second number:");
        int n2 = scan.nextInt();

        //getting the min
        int min = (n1<=n2)?n1:n2;

        // calculating
        for (int i = min; i>=1; i--) {
            if (n1%i==0 && n2%i==0) {
                System.out.println("the max dividable number is "+i);
                break;
            }
        }
        //getting the max
        int max = (n1>=n2)?n1:n2;

        // calculating
        for (int i = max; i<=n1*n2; i++) {
            if (i%n1==0 && i%n2==0) {
                System.out.println("the min multiple number is "+i);
                break;
            }
        }

         

    }
}