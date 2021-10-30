package Modle.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemNine {
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        evenSumMax(h);
    }

    public static void evenSumMax(Scanner x){
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        int a = x.nextInt();
        int z = 0;
        for(int b = 1; b <= a; b++){
            Scanner c = new Scanner(System.in);
            System.out.println("Number " + b + ":");
            if(c.nextInt() % 2 == 0){
                Numbers.add(c.nextInt());
                z += c.nextInt();
            }
        }
        System.out.println("Even Sum:" + z);

        Object[] objects = Numbers.toArray();
        Arrays.sort(objects);
        int p = objects.length;
        Object ui = objects[p-1];
        System.out.println("Even Max: " + ui.toString() );




    }
}
