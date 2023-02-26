package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int a = first >= second ? (first>third ? first:third) : (second>=third ? second : third);
        System.out.println(a);
    }
    
    public static void main (String[] args){
        TernaryMaxNumberPrinter main = new TernaryMaxNumberPrinter();
        
        main.printGreatest(15,45,10);
        
    }
    
}
