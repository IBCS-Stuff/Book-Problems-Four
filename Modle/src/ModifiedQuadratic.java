import java.util.InputMismatchException;
import java.util.Scanner;

public class ModifiedQuadratic {
    public static void main(String[] args){
        Scanner Median = new Scanner(System.in);
        System.out.println("Enter in a number");
        int a = Median.nextInt();

        Scanner MedianTwo = new Scanner(System.in);
        System.out.println("Another Number");
        int b = MedianTwo.nextInt();

        Scanner MedianThree = new Scanner(System.in);
        System.out.println("Another Number");
        int c = MedianThree.nextInt();
        Quadratic(a, b, c);

    }

    public static void Quadratic(int a, int b, int c){
        try {
            Double x1 = ((-b + Math.sqrt(((double)(b * b)) - 4 * a * c))/2 * a);
            Double x2 = ((-b - Math.sqrt(((double)(b * b)) - 4 * a * c))/2 * a);
            System.out.println("Roots: " + x1 + ", " + x2);
        }
        catch (InputMismatchException T) {
            System.out.println("Something went Wrong");
        }
    }
}
