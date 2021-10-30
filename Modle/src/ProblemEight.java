package Modle.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemEight {
    public static void main(String[] args){
        System.out.println("How many numbers do you want to enter?");
        Scanner zero = new Scanner(System.in);
        smallestLargest(zero);
    }

    public static void smallestLargest(Scanner x){
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        int a = x.nextInt();
        for(int b = 1; b <= a; b++){
            Scanner c = new Scanner(System.in);
            System.out.println("Number " + b + ":");
            Numbers.add(c.nextInt());
        }
        
        Object[] objects = Numbers.toArray();
        Arrays.sort(objects);
        int z = objects.length;
        Object y = objects[0];
        System.out.println("Smallest number: " + y.toString());
        Object ui = objects[z-1];
        System.out.println("Largest number: " + ui.toString() );
        
    }
}
