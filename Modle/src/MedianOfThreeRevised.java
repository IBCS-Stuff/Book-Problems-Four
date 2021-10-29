import java.util.Scanner;

public class MedianOfThreeRevised {
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
        System.out.println(medianOf3(a, b, c));
    }
    public static int medianOf3(int n1, int n2, int n3) {

    }
}