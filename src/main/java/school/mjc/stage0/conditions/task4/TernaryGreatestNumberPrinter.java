package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int b;
        b = first >= second ? first:second;
        System.out.println(b);
        
    }
    
    public static void main (String[] args){
        TernaryGreatestNumberPrinter main = new TernaryGreatestNumberPrinter();
        main.printGreatest(27,15);
    }
}
