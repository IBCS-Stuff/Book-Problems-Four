package Modle.src;

public class Months {
    public static void main(String[] args){
        daysInMonth(13);
    }

    public static void daysInMonth(int i){
        if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
            System.out.println("There are 31 days in this month");
        }
        else if(i == 4 || i == 6 || i == 9 || i == 11){
            System.out.println("This month has 30 days in it");
        }

        else if(i == 2){
            System.out.println("This month has 28 days in it");
        }

        else{
            System.out.println("Invalid Input");
        }

    }
}
