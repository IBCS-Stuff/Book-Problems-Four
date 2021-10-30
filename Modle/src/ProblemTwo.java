package Modle.src;

public class ProblemTwo {
    public static void main(String[] args){
        repl("hello", 3);
    }

    public static void repl(String x, int t){
        if(t <= 0){
           System.out.println(" ");
        }

        else{
            for(int i = 1; i <= t; i++){
                System.out.print(x);
            }
        }

    }
        
    }

