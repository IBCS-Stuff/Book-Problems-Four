package Modle.src;

public class OddNumbers {
    public static void main(String[] args){
        OddNumCounter(2, 2, 3);
    }
    public static void OddNumCounter(int a, int b, int c) {
        int NumbersOfOdds = 0;
        if (a % 2 != 0) {
            NumbersOfOdds++;
        }
        if (b % 2 != 0) {
            NumbersOfOdds++;
        }
        if (c % 2 != 0) {
            NumbersOfOdds++;
        }
        System.out.print(NumbersOfOdds + " of the 3 Numbers are odd");
    }

}
