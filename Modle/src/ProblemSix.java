package Modle.src;

public class ProblemSix {
    public static void main(String[] args){
        printRange(0, 11);
    }

    public static void printRange(int a, int b){
        if(a < b){
            for(int x = a; x <= b; x++){
                System.out.print(x + " ");
            }
        }
        else if(a > b){
            for(int x = a; x >= b; x--){
                System.out.print(x + " ");
            }
        }
        else{
            System.out.print(a);
        }
    }
}
